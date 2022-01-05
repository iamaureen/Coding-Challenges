package LeetCode;

import java.util.*;

//https://leetcode.com/problems/count-common-words-with-one-occurrence/

 

public class p2085_count_common_words_one_occurrence {
	
	public int countWords(String[] words1, String[] words2) {
        // using two hash maps
        /* 
        Map<String, Integer> map1 = new HashMap<String, Integer>();
        Map<String, Integer> map2 = new HashMap<String, Integer>();
        
        for(String words : words1){
            map1.put(words, map1.getOrDefault(words, 0)+1);
        }
        
        for(String words : words2){
            map2.put(words, map2.getOrDefault(words, 0)+1);
        }
        
        int count = 0;
        for(String words:map1.keySet()){
            if(map1.get(words) == 1 && map2.containsKey(words) && map2.get(words) == 1) {
                count++;
            }
        }
        
        return count; */
        
        //using a single hashmap
        Map<String, Integer> map = new HashMap<String, Integer>();
        
        for(String words : words1){
            map.put(words, map.getOrDefault(words, 0)+1);
        }
        
        for(String words : words2){
            //check with <=1 as if it is greater than 1, clearly the word appears more than once                           and violates the conditon + let's say a, a appears twice in both the sentences; it                       would result to 0 as well - however they are not appearing exactly once.  
            if(map.containsKey(words) && map.get(words) <=1){
                map.put(words, map.get(words)-1);
            }
        }
        
        int count = 0;
        for(String words: map.keySet()){
            if(map.get(words) == 0) count++;
        }
        
        return count;
        
    }
	 
}
	

