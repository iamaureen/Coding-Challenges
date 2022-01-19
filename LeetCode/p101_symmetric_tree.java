package LeetCode;

public class p101_symmetric_tree {

}

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
//https://leetcode.com/problems/symmetric-tree/

class Solution {
public boolean isSymmetric(TreeNode root) {
        
        if(root == null) return true;
        
        //compare left subtree vs. right subtree
        return isSymmetric(root.left, root.right);
        
    }
    
    public boolean isSymmetric(TreeNode left, TreeNode right){
        
        if(left == null || right == null){
            return left == right; //if both are null then the node is symmetric
        }
        
        if(left.val != right.val) return false;
        
        return isSymmetric(left.left, right.right) && isSymmetric(left.right,right.left);
        
    }
}

//run time O(N) - since we visit each node recursively 
//space complexity 0(N) - stack size of the nodes because of the recursion calls