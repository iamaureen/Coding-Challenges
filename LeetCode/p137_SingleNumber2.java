package LeetCode;

import java.util.HashMap;

//problem: https://leetcode.com/problems/single-number-ii/

public class p137_SingleNumber2{
	
	public int singleNumber(int[] nums) {
	        
	        HashMap<Integer, Integer> count = new HashMap<>();
	        
	        for(int num: nums){
	            count.put(num, count.getOrDefault(num, 0)+1);
	        }
	        
	        for(int k: count.keySet()){
	            if(count.get(k) == 1) return k;
	        }
	        
	        return -1;
	        
	        //time complexity: o(n) to iterate over the input arrat
	        //space complexity: o(n) to keep the hashmap of n/3 elements
	        
    }

}
