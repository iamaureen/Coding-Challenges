
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author Ishrat Ahmed
 */
public class isPallindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner in = new Scanner(System.in);
        
        String input1 = in.nextLine();
        String input2 = in.nextLine();
        
        if(input1.length()!=input2.length()) {
            System.out.println("not pallindrome");
            return;
        }
        
        String reverse = reverse(input1);
        
        if(input1.equals(reverse)){
            System.out.println("String is pallindrome");
        }else{
            System.out.println("not pallindrome");
        }
    
    }
    
    public static String reverse(String s){
      
        int i;
        String rev = "";
        for(i=s.length()-1; i>=0; i--){
            rev += s.charAt(i);
        }
        return rev;
    }
    
    
    
}
