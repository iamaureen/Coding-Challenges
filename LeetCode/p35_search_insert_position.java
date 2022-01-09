package LeetCode;

//https://leetcode.com/problems/search-insert-position/

public class p35_search_insert_position {
	
	public int searchInsert(int[] nums, int target) {
	        
	        int pivot, left = 0, right = nums.length - 1;
	        
	        while(left <= right){
	            
	            pivot = left + (right-left)/2; //If left + right is greater than the maximum int value 2^{31} - 1 
	            								// it overflows to a negative value.
	            
	            if(nums[pivot] == target) return pivot;
	            
	            if(target < nums[pivot]) right = pivot - 1;
	            else left = pivot + 1; 
	            
	        }
	        
	        return left;
	    }

}
