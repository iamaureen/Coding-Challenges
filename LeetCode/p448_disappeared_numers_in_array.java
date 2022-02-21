package LeetCode;

import java.util.*;


//problem: https://leetcode.com/problems/number-of-segments-in-a-string/

public class p448_disappeared_numers_in_array {
	
	public List<Integer> findDisappearedNumbers(int[] nums) {
        
//      HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
     
//      //loop through the array and put the items in the map
//      for(int i=0; i<nums.length; i++){
//          map.put(nums[i], nums[i]);
//      }

	//hashtable is not needed here as we don't need the frequency
		
     HashSet<Integer> set = new HashSet<>();
     for(int i=0; i<nums.length; i++){
         set.add(nums[i]);
     }
     
     List<Integer> result = new ArrayList<>();
     
     for(int i=1; i<=nums.length; i++){
         if(!set.contains(i)){
             result.add(i);
         }
     }
     
     return result;
     
     //time/space complexity: o(n)
     
 }
}


