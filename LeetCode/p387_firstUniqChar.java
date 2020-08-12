package LeetCode;

import java.util.HashMap;

//problem: https://leetcode.com/problems/first-unique-character-in-a-string/
public class p387_firstUniqChar {
	
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
        
		//solution 1: array method
//		int[] frequency = new int[26];
//		for(char c: s.toCharArray()) {
//			//count each character frequency
//			frequency[c-'a']++;
//		}
//		//once done with counting frequency check which character has one occurence
//		//return that index
//		for(int i=0;i<s.length();i++) {
//			if(frequency[s.charAt(i)-'a'] == 1) {
//				return i;
//			}
//		}
//		
//		return -1;
		
		//solution 2: hashmap method
		HashMap<Character, Integer> map = new HashMap<Character, Integer> ();
		
		for(char c: s.toCharArray()) {
			if(map.get(c) != null) {
				map.put(c, map.get(c)+1);
			}else map.put(c, 1);
			
			//the above three lines can be replaced with the following:
			//map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		for(int i=0;i<s.length();i++) {
			if(map.get(s.charAt(i)) == 1) return i;
		}
		
		return -1;
		
		//runtime with hashmap is greater than runtime with array. memory consumption is almost the same. why? 
       
    }

	public static void main(String[] args) {
		System.out.println(firstUniqChar("loveleetcode"));
	}

}
