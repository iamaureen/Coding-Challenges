package LeetCode;

import java.util.*;
import java.util.HashMap;
import java.util.Map;

//problem: https://leetcode.com/problems/intersection-of-two-linked-lists/
//solution: https://www.youtube.com/watch?v=CPXIkMWNn5Q

public class p160_Intersection_Linked_List {
	
	  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
	        
	        //keep track of what we have already seen
	        
	        Set<ListNode> visited = new HashSet<>();
	        
	        //traverse through list A
	        while(headA!=null){
	            visited.add(headA);
	            headA = headA.next;
	        }
	        
	        //traverse through list B
	        while(headB!=null){
	            //if there is a node that matches with list A - it means it is the intersection , so return
	            if(visited.contains(headB)) return headB;
	            
	            //if visited doesn't contain, then continue traversing
	            headB = headB.next;
	        }
	        
	        //if there is no interesection, it will reach here, so return null
	        return null;
	        
	        //time: o(m+n)
	        //space: hashset stores every single node of list A: o(m)
	    }
	
}






