package LeetCode;


//heap solution explanation - https://www.youtube.com/watch?v=FrWq2rznPLQ

import java.util.Arrays;
import java.util.PriorityQueue;

public class p215_Kth_largest_element {
	
	public int findKthLargest(int[] nums, int k) {
        //naive solution 
        /* if(nums == null || k == 0) return -1;
        Arrays.sort(nums);
        return nums[nums.length-k];*/

        /* time complexity: nlogn because of sorting */
        
        //solution using heap
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        for(int i:nums){
            minHeap.add(i);
            if(minHeap.size() > k) minHeap.remove(); //we care about K elements at a time
        }
        //once this loop finishes, we'll have the last K elements in the heap and because its a minHeap         the K'th largest element will be on top/root
        
        return minHeap.remove(); 
        //time complexity o(n)
        
        
    }
	
	
	public static void main(String[] args) {
		
	}

}
