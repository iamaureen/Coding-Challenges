package LeetCode;

//https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/

public class RemoveDuplicates {
	
	public static int removeDuplicates(int[] nums) {
        int length = 0;
        int i = 0, j;
        if(nums.length<=1) 
            return nums.length;
        
        for (j = 1; j < nums.length; j++){
            if(nums[i]!=nums[j]){
                length++;
                i++;
                nums[i] = nums[j];
            }
        }
        return length+1;
        
    }
	
	public static void main(String arg[]) {
		
		int[] nums = {1,1,2,5,6,6};
		int length = removeDuplicates(nums);
		
		System.out.print("[");
		for (int i = 0; i < length ; i++) {
			System.out.print(nums[i]);
			if(i<length-1) System.out.print(",");
		}
		System.out.print("]");
		
	}
	
}


