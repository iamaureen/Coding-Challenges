package LeetCode;

//https://leetcode.com/problems/hamming-distance/description/

public class HammingDistance461 {
	
	public static int hammingDistance(int x, int y) {
		
		int xorValue = x^y; //xor sets 1 when it is different bits
		
		int count = 0;
		while(xorValue != 0 ) {
			
			xorValue = xorValue & (xorValue - 1); //this helps to count number of set bits in a number
												 //how?
												 //initial if n=odd hole we get n-1 which is even. it will reduce 1 set bit.
												 //once even, it will always be even. and with each '&(n-1)'
												 //set bit will reduce until 0.
												//n=odd example: n=111, n-1=110 so n&(n-1)=110(n-1 and even); n=011, n-1=010 so n&(n-1)=010 (n-1 and even); final result will always be even
												//n=even example: n=110, n-1=101 so n&(n-1)=100(even), n=1000, n-1=0111 so n&(n-1)=0000(even); always even and set bit reduces each time
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
