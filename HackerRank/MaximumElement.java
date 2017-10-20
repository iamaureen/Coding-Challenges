package HackerRank;


import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ishrat Ahmed
 * https://www.hackerrank.com/challenges/maximum-element
 * Failed test 8-16
 */
public class MaximumElement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int N;
        Stack <Integer> st = new Stack<Integer>();  
        Stack <Integer> max = new Stack<Integer>();
        max.push(0);        
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        for(int i=0; i<N; i++){
            
            int type = in.nextInt();
            switch(type){
                case 1:
                    int num = in.nextInt();
                    st.push(num);
                    //push the maximum number in the max stack
                    //max stack will have larger value sequentially
                    if(st.peek()>=max.peek()){                       
                        max.push(num);
                    } 
                    break;
                case 2:
                    if(!st.empty() ){
                        //so when pop, check if it is the max one, then pop and set m to next 
                        //smaller number which is actually the maximum
                        if(st.peek() == max.peek()){
                            max.pop();              
                        }
                        st.pop();
                    }
                    break;
                case 3:
                    if(!max.empty()){
                        System.out.println(max.peek());
                    }
                    break;
                           
            }
        }
        
    }
    
}
