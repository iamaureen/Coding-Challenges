package LeetCode;

import java.util.*;

public class ValidParenthesis20 {
	
	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();
		
		for(char c: s.toCharArray()) {
			if(c == '(') {
				stack.push(')');
			}
			else if(c == '{') {
				stack.push('}');
			}
			else if(c == '[') {
				stack.push(']');
			}else if( stack.isEmpty() || stack.pop() != c) {
				return false;
			}
			
		}
		return stack.empty();
	}
	
	
	public static void main(String[] args) {
		System.out.println(isValid("{})"));
	}

}