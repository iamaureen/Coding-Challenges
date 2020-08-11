package LeetCode;


//problem definition: https://leetcode.com/problems/palindrome-linked-list
//explanation with animation: https://www.youtube.com/watch?v=D7y_hoT_YZI
//explanation: https://www.youtube.com/watch?v=wk4QsvwQwdQ

 class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	  }

public class p234_pallindromeLinkedList {
	
	public boolean isPalindrome(ListNode head) {
	        
			ListNode fast = head, slow = head; //initially both start with the head
			
			//slow pointer increments by one, and fast pointer increments by two
			//traverse through the list until 'fast' pointer reaches the end
			while(fast!=null && fast.next!=null) {
				fast = fast.next.next;
				slow = slow.next;
			}
			//at this point, fast reached the end and broke the loop, 
			//slow reached the middle.
			//now we will reverse the remaining list starting from slow
			//and move 'fast' pointer to the beginning
			
			slow = reverse(slow);
			fast = head;
			
			//now compare values starting from fast and slow 
			//if there is a value mismatch it is not a pallindrome
			//because slow starts from middle and will end first
			while(slow!=null) {
				if(slow.val != fast.val) return false;
				slow = slow.next;
				fast = fast.next;
			}
			
			return true;
	    }

	private ListNode reverse(ListNode slow) {
		// reverse the linked list
		//need three pointers to reverse a list.
		ListNode prev = null;
		ListNode current = slow;
		ListNode next;
		
		while(current!=null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		
		return prev;
	}

}
