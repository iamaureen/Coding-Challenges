package LeetCode;

import java.util.*;

//https://leetcode.com/problems/intersection-of-three-sorted-arrays/

public class p1213_Intersection_three_arrays {
	
	public List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {
	        
	        List<Integer> result = new ArrayList<>();
	        
	        //hashmap don't preserve the key order, so we use TreeMap - sorted by keys
	        Map<Integer, Integer> counter = new TreeMap<>();
	        
	        //iterate through the three arrays
	        for(Integer e: arr1){
	            counter.put(e, counter.getOrDefault(e,0)+1);
	        }
	        
	        for(Integer e: arr2){
	            counter.put(e, counter.getOrDefault(e,0)+1);
	        }
	        
	        for(Integer e: arr3){
	            counter.put(e, counter.getOrDefault(e,0)+1);
	        }
	        
	        //since the arrays are "strictly increasing" - there would be no duplicates in the array
	        //so we look for items that appear exactly three times
	        for (Integer item:counter.keySet()){
	            if(counter.get(item) == 3){
	                result.add(item);
	            }
	        }
	        
	        return result;
	        
	        
	    }

}
