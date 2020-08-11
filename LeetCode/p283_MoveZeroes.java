package LeetCode;

import java.util.Arrays;

public class p283_MoveZeroes {
	
	public static void moveZeroes(int[] nums) {
	        
			int index=0;
			for(int i=0;i<nums.length;i++) {
				//for elements that are not 0, keep storing
				//in the same array from the beginning using 
				//index variable maintaining the position
				if(nums[i]!=0) {
					nums[index++]=nums[i];
				}
			}
			for(int i=index;i<nums.length;i++) nums[i]=0;
			System.out.println(Arrays.toString(nums));
	    }
	
	public static void main(String[] args) {
		int[] nums = {1,0,2,4,0};
		moveZeroes(nums);
	}

}
