package LeetCode;


// https://leetcode.com/problems/merge-two-sorted-lists/

 

public class p21_MergeTwoSortedLists {
	
	 public class ListNode {
	     int val;
	     ListNode next;
	     ListNode() {}
	     ListNode(int val) { this.val = val; }
	     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	 }
	 
	 public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
	        //edge cases
	        if(l1 == null && l2 == null) return null;
	        
	        //dummy node will be used to move as we add items comparing the two lists. 
	        //result points to the beginning of the merged list.
	        ListNode dummy = new ListNode(-1);
	        ListNode result = dummy; 
	        
	        //we want to compare between two elements from the two lists, that's why &&
	        while (l1!=null && l2!=null) {
	            if(l1.val<l2.val){
	                dummy.next = l1; 
	                l1 = l1.next; //proceed to the next element in l1 list
	            }else{
	                dummy.next=l2;
	                l2=l2.next;
	            }
	            //move the dummy pointer to the next, so we don't overwrite element in the dummy list
	            dummy = dummy.next;
	        }
	        
	        if(l1!=null) //second list is null;
	        {
	            dummy.next = l1;
	        }else{
	            dummy.next = l2;
	        }
	        
	        return result.next;
	        
	    }
	 
}
	

