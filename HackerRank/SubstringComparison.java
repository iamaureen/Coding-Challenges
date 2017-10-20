package HackerRank;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ishrat Ahmed
 * https://www.hackerrank.com/challenges/java-string-compare?h_r=next-challenge&h_v=zen
 */
public class SubstringComparison {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }

    private static String getSmallestAndLargest(String s, int k) {
        
        int i;
        ArrayList<String> substring = new ArrayList<String>();
                
        for(i=0;i<=s.length()-k;i++){
            
            //System.out.println(s.substring(i, k+i));
            substring.add(s.substring(i, k+i));
            
        }
        
        Collections.sort(substring);
        int length = substring.size();
        //System.out.println(substring.get(0));
        //System.out.println(substring.get(length-1));
        String smallest = substring.get(0);
        String largest = substring.get(length-1);
        
        
        return smallest+"\n"+largest;
            
    }
    
}
