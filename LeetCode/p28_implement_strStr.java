package LeetCode;

//problem: https://leetcode.com/problems/implement-strstr

public class p28_implement_strStr{
	 public static int strStr(String haystack, String needle) {
		 	//version - 1
			// This will return the index of the substring present in haystack
	        //return haystack.indexOf(needle);
		 
		 	//version - 2 -- without index of
		 	if(needle.length() == 0) return 0; //given 
		 	if(haystack.length() == 0) return -1;
		 	//if the remaning elements are less than the length of needle, stop iterating
		 	for(int i=0; i<=haystack.length()-needle.length();i++) {
		 		if (haystack.charAt(i) == needle.charAt(0)) {
		 			//take substring from the point where it matched the index until the length of needle
		 			String temp = haystack.substring(i, i+needle.length());
		 			if(temp.equals(needle)) return i;
		 			
		 		}
		 		
		 	}
		 	return -1;
	    }
	 
	 public static void main(String[] args) {
		 System.out.println(strStr("a","a"));
	 }

}
