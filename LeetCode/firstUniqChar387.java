package LeetCode;

//problem: https://leetcode.com/problems/first-unique-character-in-a-string/
public class firstUniqChar387 {
	
//public static int firstUniqChar(String s) {
//        
//        for(Character c: s.toCharArray()) {
//        	if(s.indexOf(c) == s.lastIndexOf(c)) {
//        		return s.indexOf(c);
//        	}
//        }
//        
//        return -1;
//    }
	
	//another version without using the built in methods
	//this is faster version than the previous version
	public static int firstUniqChar(String s) {
        
		int[] frequency = new int[26];
		for(char c: s.toCharArray()) {
			//count each character frequency
			frequency[c-'a']++;
		}
		//once done with counting frequency check which character has one occurence
		//return that index
		for(int i=0;i<s.length();i++) {
			if(frequency[s.charAt(i)-'a'] == 1) {
				return i;
			}
		}
		
		return -1;
       
    }

	public static void main(String[] args) {
		System.out.println(firstUniqChar("loveleetcode"));
	}

}
