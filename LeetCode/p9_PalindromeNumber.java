package LeetCode;

public class p9_PalindromeNumber {
	
	public static boolean isPalindrome(int x) {
		
		if(x<0) return false; 
		int original_num = x;
		int reverse_num = 0;
		
		while(x>0) {
			reverse_num = reverse_num*10 + x%10;
			x = x/10;
		}
		
		return reverse_num==original_num;
	}
	
	public static void main(String[] args) {
		System.out.println(isPalindrome(98));
	}

}
