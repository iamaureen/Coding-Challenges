package LeetCode;


//https://leetcode.com/problems/missing-number/

public class p268_missing_number {
	
	public int missingNumber(int[] nums) {
        int missing = nums.length; //the array should have 0 to n-1 distinct elements. instead it has 0 to n elements meaning the n number replaces the missing element. we initialize with n, and continue xor-ing with index and values, as one index will not have a pair, and that is the missing number
        
        for(int i=0;i<nums.length;i++){
            missing = missing ^ i ^ nums[i];
        }
        
        return missing;
    }

}
