package LeetCode;

//https://leetcode.com/problems/word-pattern/

import java.util.*;

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

public class p226_invert_binary_tree {
	
	 public TreeNode invertTree(TreeNode root) {
	        
	        //solution: iterative
	        if(root == null) return null;
	        Queue<TreeNode> treeQ = new LinkedList<TreeNode>();
	        
	        treeQ.add(root);
	        
	        while(!treeQ.isEmpty()){
	            TreeNode current = treeQ.remove();
	            
	            TreeNode temp = current.left;
	            current.left = current.right;
	            current.right = temp;
	            
	            if(current.right!=null) treeQ.add(current.right);
	            if(current.left!=null) treeQ.add(current.left);
	            
	        }
	        
	        return root;
	        
	        
	        //solution: recursive
	        /* if (root == null) return null;
	        
	        TreeNode right = invertTree(root.right);
	        TreeNode left = invertTree(root.left);
	        
	        root.left = right;
	        root.right = left;
	        
	        return root; */
	        
	    }
	 
	 

}
