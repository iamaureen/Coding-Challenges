package LeetCode;

import java.util.*;

//leetcode url: https://leetcode.com/problems/subtree-of-another-tree/

public class p572_Subtree_another_tree {
	  
	public boolean isSubtree(TreeNode root, TreeNode subRoot) {
	        
	        //If root is null, then return false now else the third statement will give error.
	        if (root == null) {
	            return false;
	        }
	        
	        //finding subtree starting from the root
	        if (isSubtreeFound(root, subRoot)) {
	            return true;
	        }
	        
	        //Else, subtree does not start from the root
	        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
	    }
	    
	    public boolean isSubtreeFound(TreeNode root, TreeNode subRoot){
	        
	        //if both are null, return true - else any of them are null return false;
	        if(root == null || subRoot == null) {
	            return root == subRoot;
	        }
	        
	        //if the valye of the root and the subroot are not the same, return false;
	        if(root.val != subRoot.val) {
	            return false;
	        }
	        
	        //if the value of the root and the subroot are equal, check their left and right child
	        return isSubtreeFound(root.left, subRoot.left) && isSubtreeFound(root.right, subRoot.right);
	            
	    }
   
}



