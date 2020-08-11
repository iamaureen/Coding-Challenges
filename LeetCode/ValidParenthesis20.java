package LeetCode;

import java.util.*;

public class ValidParenthesis20 {
	
	public static boolean isValid(String s) {
//		Stack<Character> stack = new Stack<Character>();
//		
//		for(char c: s.toCharArray()) {
//			if(c == '(') {
//				stack.push(')');
//			}
//			else if(c == '{') {
//				stack.push('}');
//			}
//			else if(c == '[') {
//				stack.push(']');
//			}else if( stack.isEmpty() || stack.pop() != c) {
//				return false;
//			}
//			
//		}
//		return stack.empty();
		
		
		//edge case
        if(s == null || s.length() == 0) return true;
        //for a valid parenthsis it needs to be an even length string. 
        if(s.length()%2 == 1) return false;  
        
        Stack<Character> parenthesis_stack = new Stack<Character>();
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') parenthesis_stack.push(s.charAt(i));
            //if we get a closing brace, we need to check the top of the stack for the matched pair, if found -- pop
            else if(s.charAt(i) == ')' && !parenthesis_stack.isEmpty() && parenthesis_stack.peek() == '(') parenthesis_stack.pop();
            else if(s.charAt(i) == '}' && !parenthesis_stack.isEmpty() && parenthesis_stack.peek() == '{') parenthesis_stack.pop();
            else if(s.charAt(i) == ']' && !parenthesis_stack.isEmpty() && parenthesis_stack.peek() == '[') parenthesis_stack.pop();
            
        }
        
        if(parenthesis_stack.isEmpty()) return true;
        else return false;
        
	}
	
	
	public static void main(String[] args) {
		System.out.println(isValid("]"));
	}

}
