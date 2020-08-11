package LeetCode;

//problem statement: https://leetcode.com/problems/roman-to-integer
//solution hint/explanation: https://www.youtube.com/watch?v=Xy1dfcg7P-Y
//
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class p13_RomanToInteger {
	
	public int romanToInt(String s) {
		//edge cases - if the string is null or an empty string return 0
		if(s == null || s.length() == 0) return 0;
		
		//roman numbers has seven digits
		//mapping roman digit to decimal digit
		Map<Character, Integer> romanValues = new HashMap<>();
		romanValues.put('I', 1);
		romanValues.put('V', 5);
		romanValues.put('X', 10);
		romanValues.put('L', 50);
		romanValues.put('C', 100);
		romanValues.put('D', 500);
		romanValues.put('M', 1000);
		
		//technique: traverse from last. 
		//
		int length = s.length();
		int result = romanValues.get(s.charAt(length-1));
		
		//loop through the entire digit string from the second last digit. 
		//if the current digit is greater than later digit, add (VI) else add
		for(int i=length-2; i >=0; i--) {
			
			if(romanValues.get(s.charAt(i)) >= romanValues.get(s.charAt(i+1))) {
				result += romanValues.get(s.charAt(i));
			}else {
				result -= romanValues.get(s.charAt(i));
			}
		}

		return result;
	}

	public static void main(String[] args) {
		
		RomanToInteger13 obj = new RomanToInteger13();
		System.out.println(obj.romanToInt("XIV"));
	}
		
}
