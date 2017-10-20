package HackerRank;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * reference: https://www.hackerrank.com/challenges/s10-interquartile-range
 * @author Ishrat Ahmed
 */
public class InterquartileRange {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int N, i;
        float q1, q2, q3; 
       
        Scanner input = new Scanner(System.in);
        N = input.nextInt();
        //declare array
        int array[] = new int[N];
        int frequency[] = new int[N];
        
        ArrayList<Integer> al = new ArrayList<Integer>();
        //take input
        for(i=0;i<N;i++){
            array[i]=input.nextInt();
        }
        
        for(i=0;i<N;i++){
            frequency[i]=input.nextInt();
            
            for(int j=0;j<frequency[i];j++){
                al.add(array[i]);
            }
        }
        
        //System.out.println(al);
        //converting Integer arraylist to array
        Integer[] data = al.toArray(new Integer[al.size()]);
        
        Arrays.sort(data);
        
        if(data.length%2==1){
            int index = (data.length-1)/2;
            q1 = findQuartile(data, 0, index-1);          
            q3 = findQuartile(data, index+1, data.length-1);
            
            System.out.println(q3-q1);
         
            
            
        }else{
            int index = data.length/2;
            q1 = findQuartile(data, 0, index-1);            
            q3 = findQuartile(data, index, data.length-1);
            
            System.out.println(q3-q1);
            
        }
        
    }
    
     private static int findQuartile(Integer[] array, int start, int end) {
       
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
