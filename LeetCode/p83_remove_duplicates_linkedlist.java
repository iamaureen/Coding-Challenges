package LeetCode;

//https://leetcode.com/problems/remove-duplicates-from-sorted-list/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

public class p83_remove_duplicates_linkedlist{
	
public ListNode deleteDuplicates(ListNode head) {
        
        ListNode current = head;
        //the list is already sorted, so ccarefully check the values of the linked list and handle the pointers
        while(current != null && current.next !=null){
            if(current.val == current.next.val){
                current.next = current.next.next;
            }else{
                current = current.next;
            }
        }
        
        return head;
    }

}
