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
		
		 if(head == null) return null;
	        
		 	Node prev = null;
		 	Node current = head;
	        
	        while(current != null){
	            
	            if(current.x == val){
	                
	                //if the element is in the beginning, forward the head to the next element;
	                if(current == head) head = current.next; 
	                else prev.next = current.next; 
	                
	                current = current.next; 
	                continue;
	            }
	            
	            prev = current;
	            current = current.next; 
	            
	        }
	        
	        return head;
		
//		//three cases
//        //1. value can be at the beginning of the linked list (head value)
//        //2. value at the middle of the linked list
//        //3. value at the end of the linked list 
//        
//        //case #1
//        while(head!=null && head.x == val){
//            head = head.next; 
//        }
//        
//        //to keep the original pointer to the head 
//        Node temp = head;
//        
//        //when we are at a node, we want to check if the next node val is equal to val, so we need to check whether both of them are not empty
//        while(temp!=null && temp.next!=null){
//            
//            //if the value is equal to the value to be removed
//            if(temp.next.x == val){
//                temp.next = temp.next.next;
//                
//            }else{
//                temp = temp.next;
//            }
//            
//        }
//        
//        return head; 
        
		/* Node newHead = new Node(-1);
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
		
		return newHead.next;*/
		
	
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
