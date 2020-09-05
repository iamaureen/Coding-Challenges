package LeetCode;


//problem statement: https://leetcode.com/problems/remove-element
public class p1009_ComplementElement {
	
	public static int bitwiseComplement(int N) {
        
        //Approach 1: Using built-in methods
        //Convert N into a binary number
        String bin = Integer.toString(N,2);
        
        
        //toggle the 0s and 1s
        StringBuilder st = new StringBuilder(bin);
        
        for(int i=0;i<st.length();i++){
        	
            if(st.charAt(i) == '0') {
                st.setCharAt(i,'1');
            }
            else {
                st.setCharAt(i,'0');
            }
        }
        
        //switch to string from stringbuilder
        String comp = st.toString();
      
        
        //convert the string to integer first 
        int temp = Integer.parseInt(comp,2);
        
        //then convert to 10 base number
        String temp_st = Integer.toString(temp,10);
        
        //return the integer
        return Integer.parseInt(temp_st);
        
    }
 
 public static void main(String[] args) {
	 int n = bitwiseComplement(5);
 }

}
