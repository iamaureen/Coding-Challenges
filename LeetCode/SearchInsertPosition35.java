package LeetCode;

public class SearchInsertPosition35 {
	
	public static int searchInsert(int[] nums, int target) {
		
//		int index = 0;
//		int i;
//		
//		//given the list is sorted
//		for (i=0;i<nums.length;i++) {
//			if(target>nums[i]) {
//				index++;
//			}
//			else {
//				
//			}
//		}
//		return index;
		
		//improvement - binary search
		
		int low = 0;
		int high = nums.length;
		
		int mid;
		
		while(low<high) {
			
			mid = low + (high-low)/2; //why low + ??
			
			if(target>nums[mid]) {
				low = mid+1;
				
			}
			else {
				high = mid;
				
			}
		}
		
		return low;
		
        
    }
	
	public static void main(String[] args) {
		
		int[] nums1 = {1,3,5,6};
		System.out.println(searchInsert(nums1,5));
		int[] nums2 = {1,3,5,6};
		System.out.println(searchInsert(nums2,2));
		int[] nums3 = {1,3,5,6};
		System.out.println(searchInsert(nums3,7));
		int[] nums4 = {1,3,5,6};
		System.out.println(searchInsert(nums4,0));
	}

}
