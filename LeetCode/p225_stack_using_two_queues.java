package LeetCode;

//https://leetcode.com/problems/implement-stack-using-queues/

import java.util.*;



public class p225_stack_using_two_queues {
	
	 public static void main(String[] args) {
		 
		 /**
		  * Your MyStack object will be instantiated and called as such:
		  * MyStack obj = new MyStack();
		  * obj.push(x);
		  * int param_2 = obj.pop();
		  * int param_3 = obj.top();
		  * boolean param_4 = obj.empty();
		  */
		 
	 }
	 
	 

}

class MyStack {
    
    Queue<Integer> q1;
    Queue<Integer> q2;

    public MyStack() {
        
        q1 = new LinkedList<Integer>();
        q2 = new LinkedList<Integer>();
        
        
    }
    
    public void push(int x) {
        
        //Step1: insert into empty q2
        q2.add(x);
        
        //Step2: add all the elements from q1 to q2
        while(!q1.isEmpty()){
            
            q2.add(q1.poll());
            
        }
        
        //Step3: swap the names of the two queues
        Queue<Integer> q = q1;
        q1 = q2;
        q2 = q;
        
    }
    
    public int pop() {
        
        return q1.poll(); //poll() returns null as opposed to remove() which throws exception
        
    }
    
    public int top() {
        
        return q1.peek();
    }
    
    public boolean empty() {
     
        return q1.size() == 0;
    }
}
