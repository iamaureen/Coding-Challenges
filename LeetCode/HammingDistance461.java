package LeetCode;

//https://leetcode.com/problems/hamming-distance/description/

public class HammingDistance461 {
	
	public static int hammingDistance(int x, int y) {
		
		int xorValue = x^y; //xor sets 1 when it is different bits
		
		int count = 0;
		while(xorValue != 0 ) {
			
			xorValue = xorValue & (xorValue - 1); //this helps to count number of set bits in a number
												 //how does it work? write an explanation
			count++;
			
		}
		
		return count;
		
		//using built in method
		//return Integer.bitCount(xorValue);
        
    }
	
	public static void main(String[] args) {
		System.out.println(hammingDistance(1,4));
	}

}
