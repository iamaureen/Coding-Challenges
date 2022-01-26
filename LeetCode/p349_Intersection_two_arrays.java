package LeetCode;

import java.util.*;

//https://leetcode.com/problems/intersection-of-two-arrays/

public class p349_Intersection_two_arrays {
	
	 public int[] set_interaction(HashSet<Integer> set1, HashSet<Integer> set2){
	        int[] output = new int[set1.size()];
	        
	        int idx = 0;
	        
	        for(Integer s:set1){
	            if(set2.contains(s)) {
	                output[idx] = s;
	                idx++;
	            }
	        }
	        
	        //return output; // number of intersection elements might be less than the size of the smallest array; e.g., set1 = {4,9,5} and set2 = {4,9,8}, output = [0,0,0], return output will return [4,9,0];
	        
	        return Arrays.copyOf(output,idx); 
	    }
	    
	    public int[] intersection(int[] nums1, int[] nums2) {
	        
	        HashSet<Integer> set1 = new HashSet<Integer>();
	        for(Integer n : nums1) set1.add(n);
	        HashSet<Integer> set2 = new HashSet<Integer>();
	        for(Integer n : nums2) set2.add(n);
	        
	        //iterate based on the smaller array - first param - smaller array size
	        if(set1.size() < set2.size()) return set_interaction(set1,set2);
	        else return set_interaction(set2,set1);
	        
	        
	    }
	    
	    //time complexity: o(n+m)
	    //space complexity: o(n+m) - worst case all elem are different

}
