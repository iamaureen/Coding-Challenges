package LeetCode;


//problem statement: https://leetcode.com/problems/remove-element
public class p27_removeElement {
	
	public int removeElement(int[] nums, int val) {
        
        int counter = 0;
        //in-place replace
        //start with an index=0, continue replacing values when
        //element of the array is not equal to the given value. 
        //return the index
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val) {
                nums[counter++] = nums[i];
            }
        }
        
        return counter;
        
    }

}
