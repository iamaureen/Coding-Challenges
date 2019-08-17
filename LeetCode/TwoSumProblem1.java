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


public class TwoSumProblem1 {
	
	public static int[] TwoSumProblem(int[] nums, int target) {

		/* brute force technique - o(n^2) solution
		int i,j;
		
		for (i=0;i<nums.length;i++) {
			for(j=i+1;j<nums.length;j++) {
				if(nums[i]+nums[j]==target) {
					return new int[] {i,j};
				}
			}
		}
		return new int[] {}; */
		
		
        //o(n) solution
		Map <Integer, Integer> map = new HashMap< >();
        int i;
        for(i = 0; i < nums.length; i++){
            map.put(nums[i], i);
        }
        
        for(i = 0; i < nums.length; i++){
            int keyToFind = target - nums[i];
            if(map.containsKey(keyToFind) && map.get(keyToFind) != i){ //why "&& map.get(keyToFind) != i" condition?**
                return new int[] {i, map.get(keyToFind)};
            }
        }
        
        return new int[] {};
        
    }
	
	public static void main(String arg[]) {
		
		int[] nums = {2,7,11,15};
		int target = 9;
		int[] nums1 = {2,7,2,15};
		int target1 = 4;
		
		int[] index = TwoSumProblem(nums, target);
		int[] index1 = TwoSumProblem(nums1, target1);

		
		System.out.println(Arrays.toString(index));
		System.out.println(Arrays.toString(index1));
		
	}
	
}

//** input array = [3,2,4]; target = 6
//i = 0; keyToFind = 6 - array[0] = 6 - 3 = 3 -- this 3 is used as key to get the index. 
//for the correct result, we need two 3s in the array, but we have one.
//w/o the && condition, map.get(keyToFind) = map.get(3) returns index 0. 
//however, index 0 is the first 3 (for the sum 6), but the algo thinks it found the second 3(for the sum 6)
//and returns [0,0] -- which is wrong because it is only one 3 
//when the && condition is added, it checks that the value in the same index is not considered for the sum




