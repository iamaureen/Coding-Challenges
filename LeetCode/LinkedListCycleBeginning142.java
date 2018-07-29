package LeetCode;

//https://leetcode.com/problems/linked-list-cycle-ii/description/
//http://umairsaeed.com/blog/2011/06/23/finding-the-start-of-a-loop-in-a-circular-linked-list/
//https://martinm2w.wordpress.com/2012/05/28/2-5-linkedlist-find-the-beginning-of-loop-in-a-circular-linkedlist/
//https://www.youtube.com/watch?v=-YiQZi3mLq0

public class LinkedListCycleBeginning142 {

	
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
	
	static Node detectCycleBeginningNode(Node head) {
		
		//solution: tortoise-hare technique
		if (head == null) return null;
		Node fast = head; 
		Node slow = head; 
		while(fast.next!=null && fast.next.next!=null) {
			fast = fast.next.next;
			slow = slow.next;
			//System.out.println(slow.x +"  "+ fast.x ); //debug purpose
			if(fast == slow) {
				Node slow1 = head;
				while (slow1 != fast) {
					slow1 = slow1.next;
					fast = fast.next;
					
				}
				return fast;
			}
		}
		return null;
				
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
		
		
		System.out.println(detectCycleBeginningNode(l).x);
	}

}
