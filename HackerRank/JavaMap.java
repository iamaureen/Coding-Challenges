package HackerRank;


import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ishrat Ahmed
 * reference: https://www.hackerrank.com/challenges/phone-book
 */
public class JavaMap {
    
    public static void main(String []argh)
    {
      Scanner in = new Scanner(System.in);
      Map phonebook = new HashMap();
      int n=in.nextInt();
      in.nextLine();
      for(int i=0;i<n;i++)
      {
         String name=in.nextLine();
         int phone=in.nextInt();
         
         phonebook.put(name, phone);
          
         in.nextLine();
      }
      
      while(in.hasNext())
      {
         String s=in.nextLine();
         
         if(phonebook.containsKey(s)){
             System.out.println(s+"="+phonebook.get(s));
         }else{
             System.out.println("Not found");
         }
         
      }
   }
    
}
