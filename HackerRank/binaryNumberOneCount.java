package HackerRank;

//https://www.hackerrank.com/challenges/staircase
/* input:
65535

output:
16
*/

import java.util.Scanner;

/**
 *
 * @author Ishrat
 */
public class binaryNumberOneCount{
 

 public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String nn=Integer.toBinaryString(n);

        int i,max=0,count=0;
        for(i=0;i<nn.length();i++){
            char ch=nn.charAt(i);
            if(Integer.parseInt(String.valueOf(ch))==1){
                count++;
            }
            else{
                count=0;
            }
            
            if(count>max){
                    max=count;
                }
        }
        System.out.println(max);
    }	
}