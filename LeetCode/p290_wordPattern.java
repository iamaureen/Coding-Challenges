package LeetCode;

//https://leetcode.com/problems/word-pattern/

import java.util.*;

public class p290_wordPattern {
	
	public static boolean wordPattern(String pattern, String str) {
        
        //similar to char-char mapping problem 
        
        //check for length and null
        if(pattern == null || str == null) return false;
       
        
        //convert the pattern string to CharArray
        char[] pattern_Array = pattern.toCharArray();
        
        //split the string str using space
        String[] str_array = str.split(" ");
        
         if(pattern.length() != str_array.length) return false;
        
        //Hashmap for mapping character-string
        HashMap<Character, String> map = new HashMap<Character, String>();
        //declare a set so that no two characters are mapped to the same string
        HashSet<String> set = new HashSet<String>();
        
        //loop through the pattern array
        for (int i=0;i<pattern_Array.length;i++){
            //check if the character is in the map key
            if(!map.containsKey(pattern_Array[i])){ 
                //insert the key and the corresponding string
                map.put(pattern_Array[i], str_array[i]);
                
                //check if the mapped already added then return false;
                //this is important so no two character maps to the same string
                if(!set.add(str_array[i])) return false;
            }else{
                //check if the str is equal to the stored one
            	//string not equal is different than character not equals
                if(!map.get(pattern_Array[i]).equals(str_array[i])) return false;
            }
        }
        
        return true;
        
        
   }

 	public static void main(String[] args) {
 		//System.out.println(wordPattern("abba", "dog cat cat dog"));
 		
 		System.out.println("see".equals("sene"));
 	}
	 
	 

}
