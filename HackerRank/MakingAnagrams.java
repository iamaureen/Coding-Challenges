package HackerRank;


import static java.lang.Math.abs;
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ishrat Ahmed
 * https://www.hackerrank.com/challenges/ctci-making-anagrams
 */
public class MakingAnagrams {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        int haveToBeDeleted = 0, i;
        int[] count = new int[26];
        
        //count all the occurence of first string
        for(char c:a.toCharArray()){
            count[c-'a']++;
        }
        //count all the occurence from second string, if both in first and second number will be deducted
        //if only in second string, -ve number will be stored. which later is handled by abs method
        for(char c:b.toCharArray()){
            count[c-'a']--;
        }
        for(i=0; i<count.length; i++){
            haveToBeDeleted += abs(count[i]);
        }

        System.out.println(haveToBeDeleted);
    }

}
