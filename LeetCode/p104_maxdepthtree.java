package LeetCode;

public class p104_maxdepthtree {

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
//bottom up approach 
//useful urls: https://www.youtube.com/watch?v=D2cFSDfg0So
//useful urls: https://medium.com/@harycane/maximum-depth-of-a-binary-tree-609d129fa571
class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0; //when we reach a null node (beyond leaf)
        
        int left_height = maxDepth(root.left);
        int right_height = maxDepth(root.right);
        
        return Math.max(left_height, right_height) + 1;
    }
}

//run time O(N) - since we visit each node recursively 
//space complexity 0(N) - stack size of the nodes because of the recursion calls