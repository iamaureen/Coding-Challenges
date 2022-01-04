package LeetCode;

//

import java.util.*;

//problem website: https://leetcode.com/problems/4sum/

import java.util.Arrays;
import java.util.HashSet;

public class p1512_Number_of_good_pairs {
	
public int numIdenticalPairs(int[] nums) {
        
        //approach: brute-force
        /* int count = 0;
        
        for (int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] == nums[j]) count++;
            }
        } 
        
        return count; */
        
        //approach: hashmap
        Map<Integer, Integer> count = new HashMap<Integer, Integer>();
        
        int count_pair = 0;
        
        for(int num:nums){
            count.put(num, count.getOrDefault(num, 0)+1);
        }
        
        //explanation of the formula: https://www.youtube.com/watch?v=TOpIszBSSOU
        //once we have the frequency for each number, if any number occurs more than once
        //the total number of times we can pair is can be calculated using nC2 formula. 
        //simplication of this formula leads to (n*(n-1))/2;
        for(int n:count.values()){
            if(n>1){
                count_pair += (n*(n-1))/2;
            }
            
        }
        
        return count_pair;
        
        
        
    }
	
	
	public static void main(String[] args) {
		//call the method from here
		
		int[] nums = {1,2,3,1,1,3};
		
		System.out.println(numIdenticalPairs(nums));
		
	}

}
	
