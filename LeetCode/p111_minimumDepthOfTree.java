package LeetCode;

//https://leetcode.com/problems/minimum-depth-of-binary-tree/

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

public class p111_minimumDepthOfTree {
	
	public int minDepth(TreeNode root) {
	        
	        if(root == null) return 0;
	        
	        //4 cases:
	        
	        //leaf node
	        if(root.left == null && root.right == null) return 1;
	        
	        //left == null
	        if(root.left == null) return 1+minDepth(root.right);
	        
	        //right == null
	        if(root.right == null) return 1+minDepth(root.left);
	        
	        //both are not null, find the min depth for left subtree and right subtree and add 1 to it.
	        return Math.min(minDepth(root.left), minDepth(root.right))+1;
	        
	    }


}
