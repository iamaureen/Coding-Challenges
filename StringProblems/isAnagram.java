/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringProblems;

import java.util.Scanner;

/**
 *
 * @author Ishrat Ahmed
 * Two strings,  and , are called anagrams if they contain all the same characters in the same frequencies. 
 * cinema-iceman-anagram
 * I am a weakish speller-William Shakespear-not anagram
 * 
 */
public class isAnagram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner in = new Scanner(System.in);
        
        String input1 = in.nextLine();
        String input2 = in.nextLine();
        
        input1 = input1.toLowerCase();
        input1 = input1.replace(" ", "");
        input2 = input2.toLowerCase();
        input2 = input2.replace(" ", "");
        
        //System.out.println(input1 + "  " + input2);
        
        if(check(input1,input2)){
            System.out.println("anagram");
        }else{
            System.out.println("not anagram");
        }
        
      
    }
    
    private static boolean check(String input1, String input2){
        
        if(input1.length()!=input2.length()) return false;
                  
        int[] count = new int[128]; //there are in 128 unique ascii characters
        
        int b=0,i;
        //count character occurences for input1
        for(i=0;i<input1.length();i++){
          
            b = input1.charAt(i)-'a';
            count[b]++;
        }
        //decrease character occurences for input 2 and if value is negative return 0
        for(i=0;i<input2.length();i++){
           
            b = input2.charAt(i)-'a';
           // System.out.println(b + " " + input2.charAt(i));
            count[b]--;
            
            if(count[b]<0) {
              return false;
            }
        }
        
        return true;
    }
    
}
