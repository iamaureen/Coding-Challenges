package LeetCode;

//leetcode url: https://leetcode.com/problems/add-binary/
//url with explaination: https://www.youtube.com/watch?v=tRpusgdZxrE



public class p66_plus_one {
	public String addBinary(String a, String b) {
	        
	        StringBuilder sb = new StringBuilder();
	        int i = a.length() - 1;
	        int j = b.length() - 1;
	        int carry = 0; // initially we don't have a carry
	        
	        //indices greater than 0 means we have a value to take care
	        while(i>=0 || j>=0){
	            int sum = carry; //sum will start with 0
	            
	            if(i>=0){
	                sum = sum + a.charAt(i--) - '0'; //converting char to int
	            }
	            
	            if(j>=0){
	                sum = sum + b.charAt(j--) - '0'; //converting char to int
	            }
	            
	            //sum%2 --> if sum=0: sum%2 = 0, if sum=1: sum%2 = 1; and if sum=2: sum%2 = 0
	            sb.insert(0, sum%2); //inserting 0 will shift the entire string
	           
	            //sum/2 --> if sum=2: sum/2 = 1; and if anything but 2, sum/2 = 0
	            carry = sum/2; 
	        }
	        
	        //most the significant digits created a carrt, then need to insert into the sum
	        if(carry > 0){
	            sb.insert(0, 1);
	        }
	        
	        return sb.toString();
	        
	    }
}



