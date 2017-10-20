package HackerRank;

//https://www.hackerrank.com/challenges/fibonacci-modified
/*
Print a single integer denoting the value of term tn in the modified Fibonacci sequence 
where the first two terms are  t1 and t2.

Sample Input

0 1 5

Sample Output
5

tn may exceed the range of a 64-bit integer
*/
import java.util.*;
import java.math.BigInteger;


/**
 *
 * @author Ishrat
 */
public class fibonacciModified{
 
    public static void main(String[] args) {
        
     	int i,n;
        BigInteger a,b;
        Scanner sc=new Scanner(System.in);
        a =  sc.nextBigInteger();
        b =  sc.nextBigInteger();
        n = sc.nextInt();
        BigInteger [] val = new BigInteger[n];
        val[0] = a;
        val[1] = b;
        for(i=2;i<n;i++){
            val[i]= (val[i-1].pow(2)).add(val[i-2]);
        }
        System.out.println(val[i-1]);
        
        
    }
   
}