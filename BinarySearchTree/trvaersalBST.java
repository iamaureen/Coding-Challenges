package BinarySearchTree;


//https://www.geeksforgeeks.org/print-all-odd-nodes-of-binary-search-tree/
//Time Complexity: o(n) where n is the number of nodes.

public class trvaersalBST {
	
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
	
	static void inorder(Node root) {
		
		if(root!=null) {
			inorder(root.left);
			System.out.println(root.key);
			inorder(root.right);
		}
	}
	
	static void preorder(Node root) {
		
		if(root!=null) {
			System.out.println(root.key);
			preorder(root.left);
			preorder(root.right);
		}
	}
	
	static void postorder(Node root) {
		
		if(root!=null) {
			preorder(root.left);
			preorder(root.right);
			System.out.println(root.key);
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
	  
	    inorder(root); 
	    System.out.println("----");
	    preorder(root);
	    System.out.println("----");
	    postorder(root);
	  
	} 
	
	

}
