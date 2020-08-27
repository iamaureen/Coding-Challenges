package LeetCode;

//https://leetcode.com/problems/path-sum/
//solution explanation: https://www.youtube.com/watch?v=Hg82DzMemMI

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

public class p112_PathSumTree {
	
	 public boolean hasPathSum(TreeNode root, int sum) {
	        
	        //use recursion - break down the big problem into smaller problems
	        //base case - traversed all the way down to the leaf, and its null means we did not find any path
	        if(root == null) {
	            return false;
	        }else if(root.left == null && root.right == null && sum-root.val == 0){
	            return true;
	        }else{
	            //traverse through the left and right subtree, make recursive calls
	            return hasPathSum(root.left, sum-root.val) || hasPathSum(root.right, sum-root.val);
	        }
	      
	        
	    }


}
