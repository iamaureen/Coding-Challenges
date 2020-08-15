package LeetCode;

//problem: https://leetcode.com/problems/count-and-say/submissions/

public class p38_countandsay {
	
	 public String countAndSay(int n) {
	        //nth sequence comes from the n-1th term, so we start by subtracting 1 and getting the previous value
	        
	       /* two version:
	        1. iterative: https://leetcode.com/problems/count-and-say/discuss/644014/Fast-2ms-Java-solution
	        2. recursive https://leetcode.com/problems/count-and-say/discuss/599681/Java-using-String-took-20ms-StringBuilder-1ms-same-code
	        */
	        
	        //iterative version
	        
	        //initial base case
	        StringBuilder s = new StringBuilder("1");
	        
	        //nth term is basically the count of n-1 th term. 
	        //so we start from 1 to n-1 th term
	        n = n - 1;
	        while(n!=0){
	            StringBuilder temp = new StringBuilder();
	            
	            for(int i=0; i<s.length();i++){
	                int count = 1;
	                while(i<s.length()-1 && s.charAt(i) == s.charAt(i+1)){
	                    count++ ; 
	                    i++; 
	                }
	                temp.append(count).append(s.charAt(i));
	            }
	            
	            s = temp;
	            n--; 
	        }
	        
	        return s.toString();
	    }

}
