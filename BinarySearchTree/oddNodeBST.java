package BinarySearchTree;


//https://www.geeksforgeeks.org/print-all-odd-nodes-of-binary-search-tree/
//Time Complexity: o(n) where n is the number of nodes.

public class oddNodeBST {
	
	static class Node{
		int key;
		Node left, right;
	}
	
	static Node newNode(int item) {
		Node temp = new Node();
		temp.key = item;
		temp.left = null;
		temp.right = null;
		return temp;
	}
	
	//insert new node with the given key
	static Node insert(Node node, int key) {
		//if the tree is empty, return a new node
		if (node == null)
			return newNode(key);
		
		//otherwise, add the note where appropriate
		if (key < node.key)
			node.left = insert(node.left, key);
		else
			node.right = insert(node.right, key);
		
		//return the unchanged node pointer
		return node;
	
	}
	
	static void oddNode(Node root) {
		
		if(root!=null) {
			oddNode(root.left);
			
			//if node is odd then print it
			if (root.key % 2 != 0) {
				System.out.println(root.key + " ");
			}
			
			oddNode(root.right);
		}
	}
	
	// Driver Code  
	public static void main(String[] args)  
	{  
	    /* Let us create following BST  
	        5  
	    / \  
	    3 7  
	    / \ / \  
	    2 4 6 8 */
	    Node root = null;  
	    root = insert(root, 5);  
	    root = insert(root, 3);  
	    root = insert(root, 2);  
	    root = insert(root, 4);  
	    root = insert(root, 7);  
	    root = insert(root, 6);  
	    root = insert(root, 8);  
	  
	    oddNode(root);  
	  
	} 
	
	

}
