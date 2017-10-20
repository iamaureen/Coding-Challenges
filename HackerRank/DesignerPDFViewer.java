package HackerRank;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ishrat Ahmed
 * https://www.hackerrank.com/contests/101hack40/challenges/designer-pdf-viewer
 */
public class DesignerPDFViewer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner in = new Scanner(System.in);
        int[] h = new int[26];
        for(int i=0; i < 26; i++){
            h[i] = in.nextInt();
        }
        String word = in.next();
        int max=0;
        for(char c: word.toCharArray()){
            if(h[c-'a']>max){
                max = h[c-'a'];
            }
        }
        System.out.println(word.length() * max);
    }
    
}
