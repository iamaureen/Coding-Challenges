package LeetCode;

import java.util.Arrays;
import java.util.Stack;

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
		 int sum = 0;
		 if(root != null) {
			 //boundary check
			 if(root.val >= L && root.val <= R) sum += root.val;
			 if(root.val > L) sum += rangeSumBST(root.left, L, R); // it means value is greater than L, add
			 if(root.val < R) sum += rangeSumBST(root.right, L, R);
		 }
		 return sum;  
	  }
}


class TreeNode938 {
     int val;
     TreeNode938 left;
     TreeNode938 right;
     TreeNode938(int x) { val = x; }
}
