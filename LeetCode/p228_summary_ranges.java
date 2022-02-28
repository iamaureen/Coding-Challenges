package LeetCode;

//https://leetcode.com/problems/summary-ranges/

import java.util.*;


public class p228_summary_ranges {
	
	public List<String> summaryRanges(int[] nums) {
        
        int len = nums.length;
        if (len == 0) return new ArrayList<>();
        int start = nums[0], end = 0;
        List<String> ranges = new ArrayList<>();
        for (int i = 1; i < len; i++) {
            //if the difference is more than 1, then calculate the range
            if (nums[i - 1] + 1 != nums[i]) {
                end = nums[i - 1];
                if (start == end) ranges.add(String.valueOf(start));
                else ranges.add(start + "->" + end);
                start = nums[i];
            }
        }
        
        //handle the last elements
        if (start == nums[len - 1]) ranges.add(String.valueOf(start));
        else ranges.add(start + "->" + nums[len - 1]);
        return ranges;
        
    }
	 
	 

}
