package LeetCode;

import java.util.Stack;

//problem definition: https://leetcode.com/problems/valid-anagram/


public class p242_valid_anagram {
	
	public boolean isAnagram(String s, String t) {
	        
	        if(s.length()!=t.length()) return false;
	        
	        int[] counter = new int[26];
	        
	        for (int i = 0; i < s.length(); i++){
	            
	            counter[s.charAt(i)-'a']++;
	            counter[t.charAt(i)-'a']--;
	        }
	        
	        //the count of each character should be 0 since anagram, if not return false;
	        for(int count:counter){
	            if(count!=0) return false;
	        }
	        
	        return true;
	        
	    }

}


