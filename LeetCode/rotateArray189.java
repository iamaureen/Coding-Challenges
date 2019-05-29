package LeetCode;

import java.util.Arrays;

//problem: https://leetcode.com/problems/rotate-array
//time: 16 minutes
public class rotateArray189 {
	
	public static void rotate(int[] nums, int k) {
        for(int turns=0;turns<k;turns++) {
        	
        	int last_item = nums[nums.length-1];
        	//System.out.println(last_item);
        	
        	for(int i=nums.length-2;i>=0;i--) {
        		int j = i;
        		nums[j+1] = nums[i];
        	}
        	
        	
        	nums[0] = last_item;
        }
        System.out.println(Arrays.toString(nums));
    }
	
	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6,7};
		rotate(nums,3);
	}

}
