package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/two-sum/description/
//Complexity Analysis: 
//Time complexity : O(n). We traverse the list containing n elements exactly twice. 
//Since the hash table reduces the look up time to O(1), the time complexity is O(n).

//Space complexity : O(n). The extra space required depends on the number of items stored in 
//the hash table, which stores exactly n elements. 


public class TwoSumProblem {
	
	public static int[] TwoSumProblem(int[] nums, int target) {
        
		Map <Integer, Integer> map = new HashMap< >();
        int i;
        for(i = 0; i < nums.length; i++){
            map.put(nums[i], i);
        }
        
        for(i = 0; i < nums.length; i++){
            int keyToFind = target - nums[i];
            if(map.containsKey(keyToFind) && map.get(keyToFind) != i){
                return new int[] {i, map.get(keyToFind)};
            }
        }
        
        return new int[] {};
        
    }
	
	public static void main(String arg[]) {
		
		int[] nums = {2,7,11,15};
		int target = 9;
		int[] index = TwoSumProblem(nums, target);
		
		System.out.println(Arrays.toString(index));
		
	}
	
}


