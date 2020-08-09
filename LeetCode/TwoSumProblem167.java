package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted


public class TwoSumProblem167 {
	
	public static int[] TwoSumProblem(int[] nums, int target) {

		//solution 1: hashmap solution
		//time complexity: o(n)
		//space complexity: o(n)
		
		
		//put the values in the hashmap
		/* 
		HashMap <Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0;i<nums.length;i++) map.put(nums[i],i);
		
		//
		for(int i=0;i<nums.length;i++) {
			if(map.containsKey(target-nums[i])) {
				return new int[] {i+1, map.get(target-nums[i])+1};
			}			
		}
		return null; */
		
		//solution 2: two pointer solution
		int pointer1=0;
		int pointer2=nums.length-1;
		
		//since sorted array so we continue while the first pointer is smaller than the second pointer
		while(pointer1<pointer2) {
			int sum = nums[pointer1] + nums[pointer2];
			if(sum==target) return new int[] {pointer1+1, pointer2+1};
			//if the sum is greater than target, it means we need to move to a smaller value, so decrease pointer2
			if(sum>target) pointer2--;
			else pointer1++;
		}
		return null; 
	
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




