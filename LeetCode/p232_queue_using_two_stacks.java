package LeetCode;

import java.util.Stack;

//problem definition: https://leetcode.com/problems/implement-queue-using-stacks/


public class p232_queue_using_two_stacks {
	
	public static void main(String[] args) {
		
//		/**
//		 * Your MyQueue object will be instantiated and called as such:
//		 * MyQueue obj = new MyQueue();
//		 * obj.push(x);
//		 * int param_2 = obj.pop();
//		 * int param_3 = obj.peek();
//		 * boolean param_4 = obj.empty();
//		 */
		
	}

}

class MyQueue {

    Stack<Integer> stack1;
    Stack<Integer> stack2;
    
    public MyQueue() {
        
        //initialze the stacks
        stack1 = new Stack<Integer>();
        stack2 = new Stack<Integer>();
        
    }
    
    public void push(int x) {
        
        //step 1: move all the elements from s1 to s2
        while(!stack1.isEmpty()){
            
            stack2.push(stack1.pop());
            
         }    
        
        //step 2: push the element on stack1
        stack1.push(x);

        //step 3: push everythingback to s1
        while(!stack2.isEmpty()){
            
            stack1.push(stack2.pop());
            
        }
        
        
    }
    
    public int pop() {
        
        return stack1.pop();
        
    }
    
    public int peek() {
        
        return stack1.peek();
        
    }
    
    public boolean empty() {
        
        return stack1.size() == 0;
    }
}
