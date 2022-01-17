package LeetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

//https://leetcode.com/problems/word-pattern/

public class p290_word_pattern {
	
	public static boolean wordPattern(String pattern, String s) {
        
        HashMap<Character, String> map = new HashMap<Character, String>();
        
        int pattern_length = pattern.length();
        String[] s_array = s.split(" ");
        
        int s_length = s_array.length; 
        
        if(pattern_length != s_length) return false;
        
        char[] pattern_array = pattern.toCharArray();
        
        
        for(int i=0;i<pattern_array.length;i++){
        	
        	
            if(map.containsKey(pattern_array[i])){
            	
                if(!map.get(pattern_array[i]).equals(s_array[i])) {
                	//System.out.println(map.get(pattern_array[i]));
                	//System.out.println(s_array[i]);
                	return false;
                }
               
            }else{
                if(map.containsValue(s_array[i])) {
                	//check that the keys are different
                	for(Map.Entry<Character, String> entry: map.entrySet()) {
                		if(Objects.equals(entry.getKey(), pattern_array[i])) {
                			//System.out.println((s_array[i]));
                		}else return false;
                	}
                	
                	
                }
                map.put(pattern_array[i], s_array[i]);
            }
        }
        
        return true;
    }
	 
	
	public static void main(String[] args) {
		System.out.println(wordPattern("abba", "cat dog dog cat"));
	}
	 

}
