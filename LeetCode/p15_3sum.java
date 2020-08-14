package LeetCode;

//problem: https://leetcode.com/problems/3sum/

import java.util.*;

//problem website: https://leetcode.com/problems/4sum/

import java.util.Arrays;
import java.util.HashSet;

public class p15_3sum {
	
	 public List<List<Integer>> fourSum(int[] nums, int target) {
	        
		 Arrays.sort(nums);
	        
	        //dataset to store the results;
	        Set<List<Integer>> set = new HashSet<>();
	        
	        //two pointer approach
	        for(int i=0; i<nums.length-2;i++){
	            int left = i+1;
	            int right = nums.length-1;
	            
	            
	            while(left<right){
	                int sum = nums [i] + nums[left] + nums[right];
	                
	                if(sum == 0) {
	                    set.add(Arrays.asList(nums[i], nums[left], nums[right]));
	                    left++;
	                    right--;
	                }
	                else if(sum<0) left++;
	                else if(sum>0) right--;
	                
	            }
	        }
	        
	        return new ArrayList<> (set);
	    }
	
	
	public static void main(String[] args) {
		//call the method from here
	}

}
