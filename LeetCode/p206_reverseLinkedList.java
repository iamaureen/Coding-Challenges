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
	        
	        //approach: iterative case
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
	        
	        
	        //approach: using stack
	        /* 
	         //Approach 2: using stack
	        //if head is null or if there is only one element
	        if (head == null) return null;
	        
	        //create a stack to store the nodes in the list
	        Stack<ListNode> stack = new Stack<ListNode>();
	        //loop through the list and insert into the stack
	        while(head!=null){
	            stack.push(head);
	            head = head.next; //points to the next element
	        }
	        
	        //create node to indicate the beginning of the reverse list
	        ListNode dummy = new ListNode(-1);
	        ListNode reverse = dummy; 
	        
	        while(!stack.isEmpty()){
	            //get the top of the stack element
	            ListNode current = stack.pop();
	            //add this element as the next element in the reverse list
	            //as im creating a new list so we are creating new node to hold the value each time....we add the element in reverse.next
	             reverse.next = new ListNode(current.val);
	            //now we point reverse to the newly created element so it adds the next element after this
	            reverse = reverse.next; 
	        }
	        
	        return dummy.next;
        
	         */
	        
	    }
	 
	 

}
