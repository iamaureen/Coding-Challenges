package LeetCode;

import java.util.*;

//problem: https://leetcode.com/problems/range-sum-of-bst/
public class p938_RangeSumofBST {
	 public static int rangeSumBST(TreeNode938 root, int L, int R) {
		 
		 //two types of solution: iterative and recursive
		 //iterative solution using stack
//		 int sum_iterative = 0;
//		 Stack<TreeNode938> stack = new Stack();
//		 stack.push(root);
//		 
//		 while(!stack.isEmpty()) {
//			 TreeNode938 node = stack.pop();
//			 if(node.val >= L && node.val <=R) sum_iterative += node.val;
//			 if(node.val >= L && node.left != null) stack.push(node.left);
//			 if(node.val <= R && node.right != null) stack.push(node.right); 
//		 }
//		 
//		 return sum_iterative;
		 
	
		 //recursive solution
	/*	 int sum = 0;
		 if(root != null) {
			 //boundary check
			 if(root.val >= L && root.val <= R) sum += root.val;
			 if(root.val > L) sum += rangeSumBST(root.left, L, R); // it means value is greater than L, add
			 if(root.val < R) sum += rangeSumBST(root.right, L, R);
		 }
		 return sum;  
	  } */
	 
	 //using bfs
	 
		 int sum = 0;
	     if (root == null) return sum; // no tree, so return the sum = 0
	     
	     //use bfs - traverse the nodes that falls into the range - it could be that we need to traverse every single node - bfs accomplishes that for us. 
	     //bfs requires a Queue
	     Queue <TreeNode938> queue = new LinkedList<>();
	     queue.add(root);

	     while(!queue.isEmpty()){
	    	 TreeNode938 current = queue.remove();
	         //is the current node value within our range
	         if(current.val >=L && current.val <=R) sum+=current.val;
	         
	         //do we have a left/right child to traverse, and does it fall into the range?
	         //why the condition is only greater/less than and not equal?
	         //In BST, The left subtree of a node contains only nodes with keys lesser than the node’s                   key. The right subtree of a node contains only nodes with keys greater than the node’s                 key.The left and right subtree each must also be a binary search tree.
	         if(current.left != null && current.val > L) {
	             queue.add(current.left);
	         }
	         
	         if(current.right != null && current.val < R) {
	             queue.add(current.right);
	         }
	     }
     
	     return sum;
	     //time/space complexity: o(n) -- all of the nodes in the tree will be within the range
	     
	     //NOTE: You can use either bfs or dfs but bfs avoids using recursion which generally scales             better (with dfs if you have a really large tree, you could run into a stack overflow)
	 }
}


class TreeNode938 {
     int val;
     TreeNode938 left;
     TreeNode938 right;
     TreeNode938(int x) { val = x; }
}
