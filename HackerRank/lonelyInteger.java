package HackerRank;

//https://www.hackerrank.com/challenges/lonely-integer
/*input:
5
0 0 1 2 1
output:
2

*/
import java.util.*;

public class lonelyInteger{
     private static int lonelyInt(int[] a) {
         int i;int result=0;
         for(i=0;i<a.length;i++){
             result^=a[i];
         }
        return result;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        System.out.println(lonelyInt(a));
    }

}
/*output logic:
input: 0 0 1 2 1
1^2=3
1 in binary is 01
2 in binary is 10
XOR of 01 and 10 = 11,
11 is 3 in decimal
And then your next input is 1
1^3=2
Hence the answer is 2
*/
