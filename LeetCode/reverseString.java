package LeetCode;

public class reverseString {
	
	public String reverseString(String s) {
        
		/* this solution results in TLE
		 * why??  You keep concatenating each character to the String object. 
		 * As String is immutable in Java, the concatenation actually creates 
		 * a new String object with the size +1, and copy all characters and 
		 * the new one at the end. This requires at least O(s) time complexity 
		 * where s is the length of string. Hence, along with the for loop, 
		 * the total time complexity will become O(s^2). Therefore, use StringBuilder 
		 * rather than string concatenation.
		 
        int length = s.length();
        StringBuilder rev = new StringBuilder();
        for(int i=length-1; i>=0 ; i--){
            rev.append(s.charAt(i));
        }
        return rev.toString(); */
		
		int length = s.length();
        StringBuilder rev = new StringBuilder();
        for(int i=length-1; i>=0 ; i--){
            rev.append(s.charAt(i));
        }
        return rev.toString();
              
    }

}
