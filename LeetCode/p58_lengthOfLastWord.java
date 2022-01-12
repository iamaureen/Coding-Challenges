package LeetCode;

//https://leetcode.com/problems/length-of-last-word/description/

public class p58_lengthOfLastWord {
	
	 public static int lengthOfLastWord(String s) {
		
		 
//		 String[] splitString = s.trim().split(" ");
//		 int length = splitString.length;
//		 String lastWord = splitString[length-1];
//		 
//		 return lastWord.length();
		 
		 
		 String[] splitArray = s.split("\\s+"); //split whenever at least one whitespace is encountered.
		 int length = splitArray.length;  
	     String lastword = splitArray[length-1];
	     return lastword.length();
	     
	    }
	 
	 public static void main(String args[]) {
		 System.out.println(lengthOfLastWord("this is us"));
	 }

}
