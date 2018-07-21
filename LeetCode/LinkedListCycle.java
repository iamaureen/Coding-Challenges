package LeetCode;

//https://leetcode.com/problems/linked-list-cycle/description/
//more details (3 solutions): http://www.baeldung.com/java-linked-list-cyclicity

public class LinkedListCycle {

	
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
			System.out.println(item.x);
			item = item.next;
		}
	}
	
	static boolean hasCycle(Node head) {
		
		//solution: brute force technique
		/* if(head == null) return false;
		Node iterator1 = head;
		int traverseNumber = 0;
		while(iterator1!=null && iterator1.next!=null) { 
			iterator1 = iterator1.next;
			traverseNumber++;
			Node iterator2 = head;
			int x = traverseNumber;
			int count = 0;
			while(x > 0) {
				iterator2 = iterator2.next;
				if(iterator1 == iterator2) count++;
				if(count == 2) return true;
				x--;
			}
		}
		System.out.println("hello");
		return false; */
		
		
		//solution: tortoise-hare technique
		if (head == null) return false;
		Node fast = head; 
		Node slow = head; 
		while(fast.next!=null && fast.next.next!=null) {
			fast = fast.next.next;
			slow = slow.next;
			System.out.println(slow.x +"  "+ fast.x ); //debug purpose
			if(fast == slow) return true;
		}
		return false;
				
	}
	
	public static void main(String arg[]) {
		
		//create the looped linked list
		Node l = new Node(1);
		Node l1 = new Node(2);
		l.next = l1;
		Node l2 = new Node(3);
		l1.next = l2;
		Node l3 = new Node(4);
		l2.next = l3;
		Node l4 = new Node(5);
		l3.next = l4;
		l4.next = l1;
		
		
		System.out.println(hasCycle(l));
	}

}
