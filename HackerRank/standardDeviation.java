package HackerRank;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * reference: https://www.hackerrank.com/challenges/s10-standard-deviation
 * @author Ishrat Ahmed
 */
public class standardDeviation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int N,i;
        float sum=0, temp=0;
        
        Scanner input = new Scanner(System.in);
        N = input.nextInt();
        
        int array[] = new int[N];
        for(i=0;i<N;i++){
            array[i] = input.nextInt();
            sum += array[i];
        }
        //calculate mean
        float mean = sum/N;
        
        sum=0;
        
        for(i=0;i<N;i++){
            sum += (array[i]-mean)*(array[i]-mean);
        }
        
        float stdDev = sum/N;
        stdDev = (float) Math.sqrt(stdDev);
        
        System.out.println(String.format("%.1f", stdDev));
        
    }
    
}
