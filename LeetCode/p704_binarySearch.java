package LeetCode;

//https://leetcode.com/problems/binary-search/

public class p704_binarySearch {
	
	public int search(int[] nums, int target) {
	        
	        int low = 0;
	        int high = nums.length-1;
	        
	        while(low<=high){
	            int pivot = low + (high - low)/2;
	            if(nums[pivot] == target) return pivot;
	            
	            if(target<nums[pivot]) high = pivot - 1;
	            else low = pivot + 1;
	        }
	        
	        return -1;
	        
	    }

}
