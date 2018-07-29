package LeetCode;

//https://leetcode.com/problems/length-of-last-word/description/

public class lengthOfLastWord58 {
	
	 public static int lengthOfLastWord(String s) {
		
		 
		 String[] splitString = s.trim().split(" ");
		 int length = splitString.length;
		 String lastWord = splitString[length-1];
		 
		 return lastWord.length();
	     
	    }
	 
	 public static void main(String args[]) {
		 System.out.println(lengthOfLastWord(" "));
	 }

}
