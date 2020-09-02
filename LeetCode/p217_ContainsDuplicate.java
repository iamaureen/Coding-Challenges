package LeetCode;

import java.util.HashSet;
import java.util.Set;

//problem definition: https://leetcode.com/problems/product-of-array-except-self/

public class p217_ContainsDuplicate {
	public boolean containsDuplicate(int[] nums) {
        
        Set<Integer> set = new HashSet<>();
        
        //Approach 1: 
//         for(int i=0;i<nums.length;i++){
            
//             if(set.contains(nums[i])){
//                 return true;
//             }else{
//                 set.add(nums[i]);
//             }
//         }
        
//         return false;

        //Approach 2: 
        for(int i=0;i<nums.length;i++){
            //add all the elements in the set, if there is a duplicate it will not be added
            set.add(nums[i]);
        }
        
        //we check if the set length is equal to the array length 
        //if equal to array length, there is no duplicate so return false.
        if(set.size() == nums.length) return false;
        else return true;
        
        //Time Complexity: o(n) - search() and insert() for n times and each operation takes constant time
        //Space Complexity: o(n) - the space used by a hash table is linear with the number of elements in it
        
    }
	

}
