package LeetCode;

public class p388_counting_bits {
	
	
	
	 public int[] countBits(int n) {
	        
	        int[] result = new int[n+1];
	        
	        for(int i = 0; i <= n; i++){
	            
	            result[i] = count(i);
	            
	            
	        }
	        
	        return result;
	        
	    }
	    
	    public static int count(int n){
	        
	        int num_bits = 0;
	        int mask = 1;
	        //we check each of the 32 bits of the number 
	        for(int i=0; i<32; i++){
	            
	            if((n & mask) != 0){ 
	                num_bits++;
	            }
	            
	            mask <<= 1;
	        }
	        
	        return num_bits;
	        
	    }

}
