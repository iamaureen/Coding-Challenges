package LeetCode;

import java.util.*;

//https:https://leetcode.com/problems/self-dividing-numbers/

public class p783_min_distance_between_BST_nodes {
	
	public List<Integer> selfDividingNumbers(int left, int right) {
	        
	        List<Integer> result = new ArrayList<>();
	        
	        for(int i=left; i<=right; i++){
	            
	            boolean isSelfDividing = checkSelfDividing(i);
	            
	            if(isSelfDividing) result.add(i);
	            
	        }
	        
	        return result;
	        
	    }
	    
	    public boolean checkSelfDividing(int num){
	        
	        int original = num;
	        
	        while(num!=0){
	            
	            int divisor = num%10;
	            num = num/10;
	            
	           
	            if (divisor != 0 && original % divisor == 0) continue;
	            else return false;
	            
	        }
	        
	        return true;
	    }

}
