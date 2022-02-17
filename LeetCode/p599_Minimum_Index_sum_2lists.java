package LeetCode;

import java.util.*;

//leetcode url: https://leetcode.com/problems/minimum-index-sum-of-two-lists/

public class p599_Minimum_Index_sum_2lists {
	  
	public String[] findRestaurant(String[] list1, String[] list2) {
        
	      
        HashMap<String, Integer> map = new HashMap<String, Integer>();
    
        for(int i=0; i<list1.length; i++){
            //String, index
            map.put(list1[i],i);
        }
        
        List<String> result = new ArrayList<>();
        int min_index = Integer.MAX_VALUE;
        
        for(int i=0; i<list2.length; i++){
            
            if(map.containsKey(list2[i])){
                
              
                //if less than min_index found, clear the previous elements, and add
                if((map.get(list2[i]) + i) < min_index){
                    result.clear();
                    result.add(list2[i]);
                    min_index = Math.abs(map.get(list2[i]) + i);
                }
                //if the same index is found for other elements, keep adding
                else if((map.get(list2[i]) + i) == min_index){
                    result.add(list2[i]);
                }
                   
            }
        }
        
        
        
        return result.toArray(new String[0]);
        
    }
   
}



