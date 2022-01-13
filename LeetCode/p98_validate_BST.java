package LeetCode;



//https://leetcode.com/problems/validate-binary-search-tree/
public class p98_validate_BST {
	 public boolean isValidBST(TreeNode root) {
	        
	        //need to walk through all the nodes to check it is a valid binary tree
	        //top-down + check every sub-tree 
	        
	        return validate(root, null, null);
	        
	    }
	    
	    public boolean validate(TreeNode root, Integer max, Integer min){
	        //as we traverse the tree we need to compare against max, min to see it maintains the bst               property
	        if(root == null) return true; //reached leaf
	        //for the left sub-tree, here max = current node value, and root.val = left-node value of the           current node
	        //so, if the left node value should be lesser than the current node value
	        //tree 4-2-3 --> validate (node(4), 2, null)
	        else if(max != null && root.val >= max || min!=null && root.val <=min){
	            return false; 
	        } else {
	            return validate(root.left, root.val, min) && validate(root.right, max, root.val);
	        }
	    }
	    
	    //time complexity: o(n) - traverse all the nodes 
	    //space complexity: o(n) massive stack, recursive calls
}


