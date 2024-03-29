package LeetCode;

//leetcode url: https://leetcode.com/problems/merge-two-binary-trees/
//url with explaining the conditions (with visual image): https://www.codiwan.com/posts/tree/merge-two-binary-trees-617/


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

public class p617_mergeBinaryTrees {
	public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
	        
	        TreeNode originalTree = root1;
	        
	        //base-cases
	        if (root1 == null && root2 == null) return null;
	        if (root1 == null && root2 != null) return root2;
	        if (root1 != null && root2 == null) return root1;
	    
	        
	        //traverse the tree inorder
	        //condition 1: sum if both the nodes have values
	        if(root1 !=null && root2!=null) root1.val += root2.val;
	        
	        //proceed if both the nodes have left child
	        if(root1.left != null && root2.left!=null) mergeTrees (root1.left,root2.left);
	        
	        //proceed if both the nodes have right child
	        if(root1.right != null && root2.right!=null) mergeTrees (root1.right,root2.right);
	        
	        //copy the left node from the right tree if the left does not have one
	        if(root1.left == null && root2.left!=null) root1.left = root2.left;
	        
	        //copy the right node from the right tree if the left does not have one
	        if(root1.right == null && root2.right!=null) root1.right = root2.right;
	        
	        
	        return root1; 
	        
	        
	    }
}



