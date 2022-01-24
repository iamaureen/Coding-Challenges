package LeetCode;

import java.util.*;

//leetcode url: https://leetcode.com/problems/detect-capital/solution/

public class p520_detect_Capital {
	  
	public boolean detectCapitalUse(String word) {
	        
	        //regex for all capital; all small letter; first letter capital, remaining letters small
	        
	        return word.matches("[A-Z]*|[a-z]*|[A-Z][a-z]*");
	        
	    }
   
}



