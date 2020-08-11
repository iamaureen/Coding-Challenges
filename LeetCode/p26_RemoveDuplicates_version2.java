package LeetCode;

//https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
//youtube link: https://www.youtube.com/watch?v=rlfsnRY0S9k

public class p26_RemoveDuplicates_version2 {
	
	public static int removeDuplicates(int[] nums) {
		//check for edge case
        if(nums.length==0) return 0;
        
        //declare the first pointer that will keep track of the numbers in the array for duplicates. 
        int pointer1 = 0;
        int pointer2;
        
        //second pointer starts from index after pointer1
        for(pointer2=1;pointer2<nums.length;pointer2++){
            if(nums[pointer1] != nums[pointer2]){
                //number not the same, replace element after pointer1 with number in pointer2;
                nums[pointer1+1] = nums[pointer2];
                //increase both the pointers
                pointer1++;
                //pointer2++; //because pointer2 is updated in the for loop. if we add it here too; it will update the pointer2 twice.
            }
        }
        
        //at the end of the for loop, pointer1 should indicate the length (indicates the index. so, index+1)
        return pointer1+1;
        
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


