package LeetCode;

import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

//problem: https://leetcode.com/problems/add-strings/

public class p415_Add_Strings {
	
public String addStrings(String num1, String num2) {
        
        StringBuilder sb = new StringBuilder();
        
        int n = num1.length()-1;
        int m = num2.length()-1;
        int carry = 0;
        
        while(n >= 0 || m>= 0){
            
            int x1; 
            int x2; 
            
            if(n>=0){
                x1 = num1.charAt(n) - '0';
            }else {
                x1 = 0; //if this string is shorter, the remaining spaces are 0
            }
            
            if(m>=0){
                x2 = num2.charAt(m) - '0';
            }else {
                x2 = 0; //
            }
            
            int sum = x1 + x2 + carry;
            int value = sum%10;
            
            sb.insert(0, value);
            
            
            carry = sum/10;
            n--;
            m--;
            
        }
        
        if(carry > 0){
            sb.insert(0, carry);
        }
        
        return sb.toString();
        
        
    }
}


