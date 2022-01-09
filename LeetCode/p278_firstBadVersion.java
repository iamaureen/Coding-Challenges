package LeetCode;


//https://leetcode.com/problems/first-bad-version/
public class p278_firstBadVersion {
	
	public int firstBadVersion(int n) {
	        
	        int left = 1;
	        int right = n;
	        
	        while(left < right){
	            
	            int pivot = left + (right-left)/2;
	            
	            if(isBadVersion(pivot)) { //if true, pivot may or may not be the first bad version BUT
	                                      // all the versions after pivot can be discarded.
	                
	                right = pivot;        //so we search in the space [left, pivot]
	                
	            }else{
	                left = pivot +1; 
	            }
	            
	            
	            
	        }
	        
	        return left;
	    }

}
