package LeetCode;

import java.util.*;

//problem: https://leetcode.com/problems/add-to-array-form-of-integer/

public class p989_Add_Array_Form_Integer {
	
	 public List<Integer> addToArrayForm(int[] num, int k) {
	        
	       
	        int current = k;
	        
	        List<Integer> result = new ArrayList();
	        
	        int i = num.length;
	        while(--i >= 0 || current > 0){
	            if(i>=0){
	                current = current + num[i];
	            }
	            
	            result.add(current%10);
	            current = current/10;
	        }
	        
	        Collections.reverse(result);
	        return result;
	        
	    }
	 
}


