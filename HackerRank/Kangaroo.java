package HackerRank;

//https://www.hackerrank.com/challenges/kangaroo
/* input:
0 3 4 2
output:
YES
input:
0 2 5 3
output:
NO
The second kangaroo has a starting location that is ahead (further to the right)
 of the first kangaroo's starting location (i.e., ). Because the second 
 kangaroo moves at a faster rate (meaning ) and is already ahead of the first 
 kangaroo, the first kangaroo will never be able to catch up. Thus, we print NO.
*/

import java.util.Scanner;

/**
 *
 * @author Ishrat
 */
public class Kangaroo{
 

 public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        int x=x1-x2;
        int v=v2-v1;
        if((x*v>0) && (x%v==0)) System.out.println("YES");
        else System.out.println("NO");
    }	
}

/*
solution idea:
with y being the number of hops
x1+yv1=x2+yv2
y=(x1-x2)/(v2-v1)
y has to be positive and integer
positive: (x*v>0)
int: (x%v==0)
*/