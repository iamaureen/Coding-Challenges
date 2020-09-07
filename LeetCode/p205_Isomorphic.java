package LeetCode;

import java.util.*;

//https:https://leetcode.com/problems/isomorphic-strings/

public class p205_Isomorphic {

	 public boolean isIsomorphic(String s, String t) {
	        //edge cases: 
	        //check for the length, if they are not equal, it can't be isomorphic
	        if(s.length() != t.length()) return false;
	        //check if any of the strings are null
	        if(s == null || t == null) return false; 
	        
	        Map<Character, Character> map = new HashMap<Character, Character>(); 
	        
	        // create a set to store mapped characters so that two characters cannot be mapped to the same character
	        HashSet <Character> set = new HashSet<Character>();
	        
	        //converting them to character array, easy to use in for loop
	        char[] sArray = s.toCharArray();
	        char[] tArray = t.toCharArray();
	        
	        for (int i = 0; i<sArray.length; i++){
	            //if the element is not present for mapping yet
	            if(!map.containsKey(sArray[i])){
	                //put it in the map for mapping i.e., a -> b
	                map.put(sArray[i], tArray[i]);
	                
	                //two characters cannot be mapped to the same character
	                //e.g., a -> a, b -> a (not possible)
	                //but, a -> b, b - > d (possible, b doesn't need to be mapped with a in reciprocal)
	                //add the mapped item in the set so we can check in the next iteration. if any character maps to it, we return false
	                if(!set.add(tArray[i])) return false;
	                
	            }else{
	                //the key exists (e.g., a), so now need to check if it is the same mapping
	                //a -> b ... a -> c -- return false false
	                if(map.get(sArray[i]) != tArray[i]) return false;
	            }
	        }
	        
	        return true;
	        
	        
	    }

}
