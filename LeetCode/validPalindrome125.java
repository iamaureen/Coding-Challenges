package LeetCode;

//problem: https://leetcode.com/problems/valid-palindrome/
//explanation: https://www.youtube.com/watch?v=rYyn9Vc-dBQ&list=PLU_sdQYzUj2keVENTP0a5rdykRSgg9Wp-&index=24
public class validPalindrome125 {
	
	public static boolean isPalindrome(String s) {
		
		String alphanumeric_string = "";
		//remove the space since the problem says only to handle alphanumeric
		for(char c: s.toCharArray()) {
			if(Character.isDigit(c) || Character.isLetter(c)) alphanumeric_string += c;
		}
		//handle uppercase loswercase letter
		alphanumeric_string = alphanumeric_string.toLowerCase();
		
		//use two pointers: one at the beginning, one at the end
		int begin_pointer = 0;
		int last_pointer = alphanumeric_string.length()-1;
		
		while(begin_pointer <= last_pointer) {
			if(alphanumeric_string.charAt(begin_pointer) != alphanumeric_string.charAt(last_pointer)) {
				return false;
			}
			begin_pointer++;
			last_pointer--;
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(isPalindrome("race a car"));
		
		
	}

}
