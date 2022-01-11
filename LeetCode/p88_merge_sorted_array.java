package LeetCode;

//https://leetcode.com/problems/merge-sorted-array/


import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class p88_merge_sorted_array {
	
	   public void merge(int[] nums1, int m, int[] nums2, int n) {
	        
	        //make a copy of the first m elements of num1
	        int[] nums1Copy = new int[m];
	        for(int i=0;i<m;i++) nums1Copy[i] = nums1[i];
	        
	        //initiate two read pointers, and one write pointers
	        int r1 = 0; 
	        int r2 = 0;
	            
	        //compare the two array elements and write into num1
	        for(int w=0; w < m+n; w++){
	            
	            //need to check r1, and r2 are not out of bound
	            //if the first array has elements, but the second array is empty - that's the answer
	            if (m>0 && n==0) return;
	            
	            //if the first array is [2,0], m=1 and second array is [1], n=1 -- the first condition helps            to add the remaining elements of the first array to be inserted into the answer array
	            if (r2 >= n || (r1 < m  && nums1Copy[r1] < nums2[r2])){
	                nums1[w] = nums1Copy[r1];
	                r1++;
	            }else {
	                nums1[w] = nums2[r2];
	                r2++;
	            }
	        }
	    }

}
