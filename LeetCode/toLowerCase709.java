package LeetCode;

//https://leetcode.com/problems/to-lower-case/description/

public class toLowerCase709 {
	
	public static String toLowerCase(String str) {
        
		String newString = new String();
        int i;
        for (i=0; i<str.length(); i++){
            char a = str.charAt(i);
            
            if(a>=65 && a<=90) {
            		a = (char) (a+32);
            }
            newString += a;
            
        }
        return newString;
    }
	
	public static void main(String args[]) {
		System.out.println(toLowerCase("HeLLO"));
	}

}
