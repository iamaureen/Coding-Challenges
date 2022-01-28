package LeetCode;

import java.util.*;

//https://leetcode.com/problems/intersection-of-two-arrays-ii/

public class p350_Intersection_two_arrays_multiple_values {
	
	public int[] intersect(int[] nums1, int[] nums2) {
	        
	        HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
	        
	        for(int i=0;i<nums1.length;i++){
	            map.put(nums1[i],map.getOrDefault(nums1[i],0)+1);
	        }
	        
	        List<Integer> result = new ArrayList<>();
	        
	        for(int i=0;i<nums2.length;i++){
	            if(map.containsKey(nums2[i]) && map.get(nums2[i])>0){
	                result.add(nums2[i]);
	                map.put(nums2[i], map.get(nums2[i])-1);
	            }
	        }
	        
	        //return result.stream().mapToInt(i -> i).toArray();
	        
	        int i=0;
	        int [] ans = new int[result.size()];
	        for(int n: result)
	            ans[i++] = n;
	        return ans;
	        
	    }

}
