package LeetCode;

import java.util.*;

//problem definition: https://leetcode.com/problems/binary-tree-paths/
//solution: https://www.youtube.com/watch?v=xqS8dyexaNM

public class p257_Binary_Tree_Paths {
	 public List<String> binaryTreePaths(TreeNode root) {
	        
	        List<String> paths = new ArrayList<>();
	        
	        //if no root, no path
	        if(root == null) return paths;
	        
	        dfs(root, "", paths);
	        
	        return paths;
	        
	    }
	    
	    public void dfs(TreeNode root, String path, List<String> paths){
	        
	        path += root.val;
	        
	        //base case, leaf node
	        if(root.left == null && root.right == null){
	            paths.add(path);
	            return;
	        }
	        
	        if(root.left != null ){
	            dfs(root.left, path + "->", paths);
	        }
	        
	        if(root.right != null ){
	            dfs(root.right, path + "->", paths);
	        }
	        
	        //time, space complexity o(n)
	    }
	

}
