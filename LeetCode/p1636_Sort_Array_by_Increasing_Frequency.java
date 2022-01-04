package LeetCode;

import java.util.*;
import java.util.Stack;

//https://leetcode.com/problems/sort-array-by-increasing-frequency/
public class p1636_Sort_Array_by_Increasing_Frequency {
	public int[] frequencySort(int[] nums) {
	        
	        Map<Integer, Integer> freq = new HashMap<>();
	        
	        for(int num:nums){
	            freq.put(num, freq.getOrDefault(num, 0) + 1);
	        }
	        
	        //if the frequency is equal, return the bigger number - else return the element in increasing order based on the frequency of elements
	        //https://coderscat.com/leetcode-sort-array-by-increasing-frequency/
	        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>((a,b) -> 
	                                                                    freq.get(a) == freq.get(b)?                                                     b-a : freq.get(a)-freq.get(b));
	        
	        minHeap.addAll(freq.keySet());
	        
	        int[] result = new int[nums.length];
	        int i=0;
	        while(!minHeap.isEmpty()){
	            int current = minHeap.remove();
	            for(int j=0; j<freq.get(current);j++) result[i++] = current;
	        }
	        
	        return result;
	        
	    }
}


