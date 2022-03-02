package LeetCode;

public class p392_is_subsequence {
	
public boolean isSubsequence(String s, String t) {
        
        //since in the description it says can be none
        
        
        int i=0, j=0;
        
        while(i < s.length() && j < t.length()){
            
            //if the two characters are same, increment to the next characters
            if(s.charAt(i) == t.charAt(j)){
                i++;
                j++;
            }else{
                //if not same, only increment t's counter
                j++;
            }
            
        }
        
        //if s is a subsequence of t, then i will be incremented to the length of s
        return i == s.length();
        
    }

}
