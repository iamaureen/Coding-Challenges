package LeetCode;

import java.util.HashSet;
import java.util.Set;

//problem: https://leetcode.com/problems/unique-email-addresses/
//ideal solution: using regex??
public class numUniqueEmails929 {
	 public static int numUniqueEmails(String[] emails) {
	       
		 //declare set to carry unique emails
		 Set<String> set = new HashSet<>();
		 
//		 for(int i=0;i<emails.length;i++) {
//			 String item = emails[i];
//			
//			 int index = item.indexOf('@');
//			 String item_before = item.substring(0, index);
//			 String item_after = item.substring(index, item.length());
//			 
//			 //we need this if because it may not have . or +;
//			 //in that case it will give index error
//			 if(item_before.contains(".")||item_before.contains("+")) {
//				 item_before = item_before.replace(".", "");
//				 if(item_before.contains("+")) {
//					 int plus_index = item_before.indexOf('+');
//					 item_before = item_before.substring(0, plus_index);
//				 }
//			 }
//			 
//			 item = item_before.concat(item_after);
//			 set.add(item); 
//			  
//		 }
		 
		 //using regex
		 for (String email : emails) {
			 	//split using @
	            String[] temp = email.split("@");
	            //regex - if . replace with "" and if +, replace everything after plus with ""
	            //+. means atleast one plus, ignore everything after that
	            String item = temp[0].replaceAll("(\\.)|(\\+.*)", "") + "@" + temp[1];
	            set.add(item);
	        }

		 
		 return set.size();
	    
	 }
	 
	 public static void main(String[] args) {
		 String[] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
		 System.out.println(numUniqueEmails(emails));
	 }
	 
}
