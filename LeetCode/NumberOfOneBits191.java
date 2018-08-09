package LeetCode;

//https://leetcode.com/problems/number-of-1-bits/description/

public class NumberOfOneBits191 {
	
	//returns the number of '1' bits it has (also known as the Hamming weight)
	public static int hammingWeight(int n) {
        int count = 0;
        while(n!=0){
            n = n & (n-1);
            count++;
        }
        return count;
        
    }
	
	public static void main(String[] args) {
		System.out.println(hammingWeight(4));
	}

}
