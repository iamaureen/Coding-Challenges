package LeetCode;

//problem website: https://leetcode.com/problems/longest-common-prefix/
//solution explanation: https://www.youtube.com/watch?v=Tj0VRPcj8pQ
//https://leetcode.com/articles/longest-common-prefix/ [different approaches - read]
import java.util.Arrays;

public class longestCommonPrefix14 {
	
	public static String longestCommonPrefix(String[] strs) {
        
		//edge cases
		if(strs.length == 0 || strs == null) return ""; 
		if(strs.length == 1) return strs[0]; //if only one element, that is the result LCP
		
		//we have more than one array element if we are here
		//we initialize LCP with the first element of the array
		String lcp = strs[0];
		
		//we start checking with the second element 
		for(int i=1;i<strs.length;i++) { //use this for loop to access the words
			int j = 0; //index to loop through the words to see the matched part
			
			//compare the two words lcp and current word in the array we are comparing
			//we will keep comparing the two words until we get a mismatch of characters
			//without the length conditions it will give index out of range exception
			while(j<lcp.length() && j<strs[i].length() && lcp.charAt(j) == strs[i].charAt(j) ) {
				j++;
			}
			
			if(j==0) return ""; //j did not increase, meaning there was no prefix for the two words. so return ""
			
			//else update lcp upto the matched j index
			lcp = lcp.substring(0,j);
			
		}
		
		return lcp;
    }
	
	
	public static void main(String[] args) {
		String[] strs = {"flower","flow","flight"};
		System.out.println(longestCommonPrefix(strs));
	}

}
