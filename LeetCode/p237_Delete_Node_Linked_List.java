package LeetCode;


//https://leetcode.com/problems/delete-node-in-a-linked-list/

public class p237_Delete_Node_Linked_List {
	
	//the head of the linked list is not given. instead only given access to the node to be deleted directly.
	public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

}
