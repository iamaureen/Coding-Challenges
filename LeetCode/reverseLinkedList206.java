package LeetCode;

//https://leetcode.com/problems/reverse-linked-list/description/

public class reverseLinkedList206 {
	
	//linked list node
		static class ListNode{
			int val;
			ListNode next;
			ListNode(int val){
				this.val = val;
				next = null;
			}
		}
	
	 public ListNode reverseList(ListNode head) {
	        
	        
	        if(head == null) return null;
	        
	        ListNode reverse=null;
	        ListNode current = head;
	        
	        
	        while(current!=null){
	            ListNode newNode = new ListNode(current.val);
	            current = current.next;
	            if(reverse == null){
	                reverse = newNode;
	            }else{
	                newNode.next = reverse;
	                reverse = newNode;
	            }
	        }
	        
	        return reverse;
	        
	    }
	 
	 

}
