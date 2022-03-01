package LeetCode;

import java.util.*;

//https://leetcode.com/problems/contains-duplicate-ii/

public class p219_ContainsDuplicate2 {
public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        //approach 1: 
        HashMap<Integer,Integer> ll = new HashMap<>();

        for(int i = 0 ; i < nums.length ; i++){
            
            if(ll.containsKey(nums[i])){
                
                if(Math.abs(i - ll.get(nums[i])) <= k){
                    return true;
                }
                else{
                    //update the index for the recent number
                    ll.put(nums[i],i);
                }
            }
            else{
                //enter into the map for the first time
                ll.put(nums[i] , i);
            }
        }
    
        return false;
       
        //approach 2: sliding window -- understand the nums[i-k] logic
       /* Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; ++i) {
            if (set.contains(nums[i])) return true;
            set.add(nums[i]);
            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }
        return false;*/
        
        }

}
