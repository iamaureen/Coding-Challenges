package LeetCode;

//https://leetcode.com/problems/reverse-linked-list/description/

public class p206_reverseLinkedList {
	
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
	        
	        
		    //edge case
	        if(head == null) return null; 
	        
	        //create a node to hold the recerse list
	        ListNode reverse = null;
	        
	        //create a node to point to the beginning of the list 
	        ListNode temp = head;
	        
	        while(temp != null){
	            //create a node with the current element of the list == i of the for loop
	            ListNode current = new ListNode(temp.val);
	            temp = temp.next; 
	            
	            //check if we have anything in the reverse list yet
	            if(reverse == null){
	                reverse = current; 
	            }else{
	                //we point the reverse list at the end of the current node
	                current.next = reverse;
	                //then we redirect reverse to the beginning of the current node
	                reverse = current; 
	            }
	            
	        }
	        
	        return reverse;
	        
	    }
	 
	 

}
