package HackerRank;

//https://www.hackerrank.com/challenges/diagonal-difference

/*input: 
3
11 2 4
4 5 6
10 8 -12
output: 15 */

import java.util.*;


public class DiagonalDifference{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        
        int fd=0,sd=0;
        int i,j, m=n-1;
        for(i=0,j=m;i<n && j>=0;i++,j--){
            fd+=a[i][i];
            sd+=a[i][j];
        }
        
        System.out.println(Math.abs(fd-sd));
    }
}
