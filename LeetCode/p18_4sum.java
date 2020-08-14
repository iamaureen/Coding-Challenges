package LeetCode;

import java.util.*;

//problem website: https://leetcode.com/problems/4sum/

import java.util.Arrays;
import java.util.HashSet;

public class p18_4sum {
	
	 public List<List<Integer>> fourSum(int[] nums, int target) {
	        
	        //declare a set to store the list of indices
	        Set<List<Integer>> set = new HashSet<>();
	        
	        //sort the input array; #why? 
	        Arrays.sort(nums);
	            
	        //two loops to monitor the first two elements
	        //loop for the first number
	        for(int i=0;i<nums.length-3;i++){
	            //loop for the second number
	            for(int j=i+1; j<nums.length-2; j++){
	                //third number
	                int left = j+1;
	                //fourth number 
	                int right = nums.length-1;
	                
	                while(left<right){
	                    //sum of the four numbers
	                    int sum = nums[i] + nums[j] + nums[left] + nums[right];

	                    if(sum == target) {
	                        //add to the set
	                        set.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
	                        left++;
	                        right--;
	                    }
	                    else if(sum<target) {
	                        left ++;
	                    }
	                    else if(sum>target) {
	                        right--;                    
	                    }
	                }
	                
	            }
	        }
	        
	        return new ArrayList<>(set);
	    }
	
	
	public static void main(String[] args) {
		//call the method from here
	}

}
