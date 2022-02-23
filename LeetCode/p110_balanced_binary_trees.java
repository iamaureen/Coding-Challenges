package LeetCode;

//https://leetcode.com/problems/balanced-binary-tree/

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

public class p110_balanced_binary_trees {
	
	 public boolean isBalanced(TreeNode root) {
	        int balanced = solve(root);
	        return balanced != -1;
	    }
	    
	    public int solve(TreeNode root) {
	        if (root == null) {
	            return 0;
	        }
	        int left = solve(root.left);
	        int right = solve(root.right);
	        if (left == -1 || right == -1) {
	            return -1;
	        }
	        if (Math.abs(left - right) > 1) {
	            return -1;
	        }
	        return 1 + Math.max(left, right);
	    }


}
