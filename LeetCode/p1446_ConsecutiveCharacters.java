package LeetCode;

//problem website: https://leetcode.com/problems/longest-common-prefix/

import java.util.Arrays;

public class p1446_ConsecutiveCharacters {
	
    public int maxPower(String s) {
        char[] st = s.toCharArray();
        
        //initial to 1 because a character can appear at least once. 
        int max=1;
        int result = 1;
        for(int i=0;i<st.length-1;i++){
            if(st[i] == st[i+1]) {
                max += 1;
            }else{
                max = 1;
            }
            
            if(max > result) {
                result = max;
            }
        }
        
        return result;
    }

}
