import java.util.Iterator;
import java.util.Stack;

public class parenthesisMatching {
	
	public static boolean isParenthesisMatch(String s){
		//declare a  stack
		Stack parenthesis = new Stack();
		
		
		//loop through the string and insert into stack if starting bracket
		for(char c: s.toCharArray()) {
			if(c == '(' | c == '{' | c == '[') parenthesis.push(c); 
			
			if(c == ')' | c == '}' | c == ']') {
				char popped = (char) parenthesis.pop();
				if( (c == ')' && popped == '(') | (c == '}' && popped == '{') | (c == ']' && popped == '[') ) {
					continue;
				}else {
					return false;
				}
			}
		}
		
		if(!parenthesis.isEmpty()) return false;
		
		
//		//check - stack print
//		Iterator<Integer> iterator = parenthesis.iterator();
//		while (iterator.hasNext()) {
//		    System.out.println(iterator.next());
//		}
		
		
		return true;
	
	}
	
	public static void main(String[] args) {
		System.out.println(isParenthesisMatch("([]"));;
	}

}
