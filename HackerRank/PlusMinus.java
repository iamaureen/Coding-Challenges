package HackerRank;

//https://www.hackerrank.com/challenges/plus-minus
/* input:
6
-4 3 -9 0 4 1   
output:
0.500000
0.333333
0.166667
*/

import java.util.Scanner;

/**
 *
 * @author Ishrat
 */
public class PlusMinus{
 

 public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
        String inp=in.nextLine();
        String input=inp.toLowerCase();
        int len=input.length();
        int[] array=new int[26];
        for(int j=0;j<array.length;j++){
            array[j]=1;
        }
        
        int i;
        for(i=0;i<len;i++){
            int index = (int)input.charAt(i);
            if(index==32) continue;
            index = index - 97;
            array[index]=0;            
        }
        
        int flag=1;
        for(i=0;i<array.length;i++){
            if(array[i]==1) {
                flag=0;
                break;
            }
        }
            
       if(flag==1){
           System.out.println("pangram");
        }else{
                System.out.println("not pangram");
            }
    }	
}