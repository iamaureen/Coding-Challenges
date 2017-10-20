package HackerRank;


import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * reference: https://www.hackerrank.com/challenges/s10-quartiles
 * @author Ishrat Ahmed
 */
public class Quartiles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int N, i;
        int q1, q2, q3;
        Scanner input = new Scanner(System.in);
        N = input.nextInt();
        
        int array[] = new int[N];
        
        for(i=0;i<N;i++){
            array[i] = input.nextInt();
        }
        //sort array
        Arrays.sort(array);
       // System.out.println(Arrays.toString(array));
        
        if(array.length%2==1){
            int index = (array.length-1)/2;
            q1 = findQuartile(array, 0, index-1);
            q2 = array[index];
            q3 = findQuartile(array, index+1, array.length-1);
            
            System.out.println(q1);
            System.out.println(q2);
            System.out.println(q3);
            
            
        }else{
            int index = array.length/2;
            q1 = findQuartile(array, 0, index-1);
            q2 = (array[index-1]+array[index])/2;
            q3 = findQuartile(array, index, array.length-1);
            
            System.out.println(q1);
            System.out.println(q2);
            System.out.println(q3);
            
        }
    }

    private static int findQuartile(int array[], int start, int end) {
       
        int length = end - start + 1;
        if(length%2 == 1){
            
            int index = (start+end)/2;
            return array[index];
            
        }else{
            int index =  (start+end)/2;
            return (array[index]+array[index+1])/2;
           
        }
        
    }
    
}
