package LeetCode;

import java.util.*;

//leetcode url: https://leetcode.com/problems/find-mode-in-binary-search-tree/
//url with explaining the conditions (with visual image): https://www.youtube.com/watch?v=1FJDyBSfEbo


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

public class p501_modeInBST {
	//1 2 3 4 4 5 5 6 -- mode is 4,5 since 4, 5 both occurs two times. 
    
	//solution - using DFS/recursion
	/*
    Integer prev = null;
    int count = 1;
    int max = 0; 
    
    public int[] findMode(TreeNode root) {
        
        List<Integer> modes = new ArrayList();
        
        
        //recursion - using dfs
        traverse (root, modes);
        
        int[] result = new int[modes.size()];
        
        //conver the list into an array
        for(int i = 0; i<modes.size();i++){
            result[i] = modes.get(i);
        }
        
        return result;
        
    }
    
    public void traverse(TreeNode node, List<Integer> modes){
        if (node == null) return;
        
        //BST is sorted - left - root - right -- in order traversal
        traverse(node.left, modes);
        
        if(prev != null){ 
            
            if(prev == node.val) count++;
            else count = 1; //if the current node value is a different value than the previous value, we reset the count
        }
        
        if(count > max) { //we found a new mode
            max = count;
            modes.clear(); //the previous modes are incorrect
            modes.add(node.val); 
        }else if(count == max) { //condition for multiple modes
            modes.add(node.val);
        }
        
        prev = node.val;
       
        traverse(node.right, modes);
    } */
	
	int maxCount = 1;
    public int[] findMode(TreeNode root) {
        
        //using hashmap
       Map<Integer, Integer> map = new HashMap<>();
       
       List<Integer> result = new ArrayList<Integer>();
       traverse(root, map);
        
       for (int c: map.keySet()){
           if(map.get(c) == maxCount) {
               result.add(c);
           }
       }
        
        //convert list to array
        //return result.toArray(new int[result.size()]); //this won't work because there's no                  conversion from Integer to in
        return result.stream().mapToInt(Integer::intValue).toArray();
        //Using the collections stream() function and then mapping to ints, you'll get an IntStream.           With the IntStream we can call toArray() which gives us int []
        
    }
   
   public void traverse(TreeNode node, Map<Integer, Integer> map){
       
       if(node == null) return;
       
       if(map.containsKey(node.val)){
           int count = map.get(node.val) + 1;
           map.put(node.val, count);
           maxCount = Math.max(maxCount, count);
       }else{
           map.put(node.val, 1);
       }
       
       traverse(node.left, map);
       traverse(node.right, map);
   }
   
}



