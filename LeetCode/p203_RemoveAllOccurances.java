package LeetCode;

//https://leetcode.com/problems/remove-linked-list-elements/description/
//Input:  1->2->6->3->4->5->6, val = 6
//Output: 1->2->3->4->5

public class p203_RemoveAllOccurances {

	
	//linked list node
	static class Node{
		int x;
		Node next;
		Node(int val){
			x = val;
			next = null;
		}
	}
	
	static void printList(Node head) {
		
		Node item = head;
		while(item!=null) {
			System.out.print(item.x+"-->");
			item = item.next;
		}
		System.out.print("null");
	}
	
	public static Node removeElements(Node head, int val) {
		
		Node newHead = new Node(-1);
		newHead.next = head;
		Node prev = newHead;
		Node current = head;
		
		while(current!=null) {
			if(current.x == val) {
				prev.next = current.next;
			}else {
				prev = prev.next;
			}
			current = current.next;
		}
		
		return newHead.next;
	
		/* the following version wont work because:
		 * for sample input [1], val=1 should return [], but returns [1] instead
		 
		Node prev = new Node(-1);
		prev.next = head;
		Node current = head;
		
		while(current!=null) {
			if(current.x == val) {
				prev.next = current.next;
			}else {
				prev = prev.next;
			}
			current = current.next;
		}
		
		return head; */
               
    } 
	
	
	
	public static void main(String arg[]) {
		
		//create the looped linked list
		Node l = new Node(1);
		Node l1 = new Node(2);
		l.next = l1;
		Node l2 = new Node(6);
		l1.next = l2;
		Node l3 = new Node(3);
		l2.next = l3;
		Node l4 = new Node(4);
		l3.next = l4;
		Node l5 = new Node(5);
		l4.next = l5;
		Node l6 = new Node(6);
		l5.next = l6;
		
		
		
		printList(removeElements(l,6));
	}

}
