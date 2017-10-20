package HackerRank;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ishrat Ahmed reference:
 * https://www.hackerrank.com/challenges/array-left-rotation
 */
public class LeftRotation {

    /**
     * @param args the command line arguments
     * two solutions: 
     * 1)using another data structure
     * 2)printing in a structured way
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        //1st way
        int i, j;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int[] array = new int[n];
        Queue<Integer> myQueue = new LinkedList<Integer>();

        for (i = 0; i < n; i++) {
            array[i] = in.nextInt();
            myQueue.add(array[i]);
        }
        
        while(d!=0){
            int temp=myQueue.remove();
            myQueue.add(temp);
            d--;
        }
        
        for (i = 0; i < n; i++) {
            int t = myQueue.remove();
            System.out.print(t+" ");
        }

     
        //    2nd way
        /*
        int j;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int[] array = new int[n];

        for (i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }

        for(j=d;j<n;j++){
            System.out.print(array[j]+" ");
        }
         for(j=0;j<d;j++){
            System.out.print(array[j]+" ");
        } */
        
        
    }
    

}
