package LeetCode;

import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

//problem: https://leetcode.com/problems/number-of-segments-in-a-string/

public class p434_number_segments_string {
	
	public int countSegments(String s) {
	        
	        //approach 1: built-in method
	//         s = s.trim(); //remove leading and trailing spaces, e.g., //input = "    "
	        
	//         if(s.equals("")) return 0; 
	    
	//         String[] array = s.split("\\s+");
	        
	//         return array.length;
	        
	        //approach 2: in-place approach
	        int segmentCount = 0;
	
	        for (int i = 1; i < s.length(); i++) {
	            //start counting at the beginning of each segment
	            //i=0 counts the first segment
	            if ((i==0 || s.charAt(i-1) == ' ') && s.charAt(i) != ' ') {
	                segmentCount++;
	            }
	        }
	
	        return segmentCount;
	    }
}


