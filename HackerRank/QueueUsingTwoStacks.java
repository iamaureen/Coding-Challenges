package HackerRank;


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
 */
public class QueueUsingTwoStacks {

    /**
     * @param args the command line arguments
     * https://www.hackerrank.com/challenges/queue-using-two-stacks
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Stack<Integer> st = new Stack<Integer>();
        Stack<Integer> temp = new Stack<Integer>();

        Scanner in = new Scanner(System.in);
        int q = in.nextInt();

        for (int i = 0; i < q; i++) {

            int type = in.nextInt();

            switch (type) {
                case 1: //enqueue
                    
                    int n = in.nextInt();
                    st.push(n);
                    break;
                case 2://dequeue
                    if(temp.isEmpty()){
                        while (st.size() != 0) {
                            temp.push(st.pop());
                        }
                    }
                    if(!temp.empty()){
                        temp.pop();
                    }
                    break;
                case 3:
                    if(temp.isEmpty()){
                        while (st.size() != 0) {
                            temp.push(st.pop());
                        }
                        System.out.println(temp.peek());
                    }
                    else{
                        System.out.println(temp.peek());
                    }
                    break;
            }
        }

    }

}
