package HackerRank;


import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * reference: https://www.hackerrank.com/challenges/s10-basic-statistics
 * @author Ishrat Ahmed
 */
public class MeanMedianMode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int N;
         
         Scanner input=new Scanner(System.in);
         N = input.nextInt();
         
	 int array[] = new int[N];
         int i, count, mode, value;
         float sum=0;
            
         
         for(i=0;i<N;i++){
             array[i]=input.nextInt();
             sum += array[i]; 
         }
         
         //mean         
         float mean=sum/array.length;
         System.out.println(String.format("%.1f", mean ));
                  
         //sort the array
        
         Arrays.sort(array);
         
         
        //median
        if(array.length%2==1){
            int index=(array.length-1)/2;
            float median = (float)array[index];
            System.out.println(String.format("%.1f", median ));
        } 
        else{
            int index=array.length/2;
            float median = (float)(array[index-1]+array[index])/2;
            System.out.println(String.format("%.1f", median ));
        }
        
        
        
        //mode     
         
         value=array[0];
         count=1;
         mode=1;
         
         
         for(i=1; i<array.length;i++){
              if(array[i]==array[i-1]){
                  count++;
              }else{
                  count=1;                  
              }
           
              if(count>mode){
                      mode=count;
                      value=array[i-1];
                  }
         }
          System.out.println(value);
    }
    
}
