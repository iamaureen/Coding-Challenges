package LeetCode;

import java.util.*;


//problem: https://leetcode.com/problems/find-all-duplicates-in-an-array/

public class p442_duplicates_in_array {
	
	public List<Integer> findDuplicates(int[] nums) {
	        
	        //frequencey - store the nums in hashmap
	        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	        
	        for(int i=0; i<nums.length; i++){
	            
	            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
	            
	        }
	        
	        List<Integer> result = new ArrayList<>();
	        
	        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
	            
	            if(entry.getValue() == 2){
	                result.add(entry.getKey());
	            }
	        }
	        
	        return result;
	        
	    }
}


