package HackerRank;

//https://www.hackerrank.com/challenges/staircase
/* input:
3

output:
6
*/

import java.util.Scanner;

/**
 *
 * @author Ishrat
 */
public class recursionFactorial{
 

  public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        
        int res = factorial(n);
        System.out.println(res);
    }
    private static int factorial(int n){
        if(n<=1) return 1;
        else return (n * factorial(n-1));
    }	
}