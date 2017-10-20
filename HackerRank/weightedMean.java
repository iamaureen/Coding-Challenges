package HackerRank;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * reference: https://www.hackerrank.com/challenges/s10-weighted-mean
 * @author Ishrat Ahmed
 */
public class weightedMean {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int N, i;
        float sum=0, sumWeight=0;
        Scanner input = new Scanner(System.in);
        N = input.nextInt();
        //declare array
        int array[] = new int[N];
        int weight[] = new int[N];
        //take input
        for(i=0;i<N;i++){
            array[i]=input.nextInt();
        }
        
        for(i=0;i<N;i++){
            weight[i]=input.nextInt();
        }
        for(i=0;i<N;i++){
            sum +=array[i]*weight[i];
            sumWeight += weight[i];
        }
        
        System.out.println(String.format("%.1f",sum/sumWeight));
    }
    
}
