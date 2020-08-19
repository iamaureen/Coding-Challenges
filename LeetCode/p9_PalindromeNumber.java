package LeetCode;

public class p9_PalindromeNumber {
	
	public static boolean isPalindrome(int x) {
		
		//Approach 1: converting to string -- two pointer approach
		
		//converting integer to string
        
        String str = Integer.toString(x);
        int length = str.length();
        int middle = length/2;
        
        //two pointer solution.
        //if the length is odd -- the middle number doesn't matter. we need to check if the
        //first half matches with the second half
        for(int i=0,j=length-1;i<=j;i++,j--){
             if(str.charAt(i) != str.charAt(j)) return false;
             else continue;
        }
           
        return true;
		
		
		//Approach 2: without converting to string
//		if(x<0) return false; 
//		int original_num = x;
//		int reverse_num = 0;
//		
//		while(x>0) {
//			reverse_num = reverse_num*10 + x%10;
//			x = x/10;
//		}
//		
//		return reverse_num==original_num;
        
        //Approach 2 took more time (12ms) and space (41.3 mb) compared to the first approach 8ms, 38.5 MB respectively.
	}
	
	public static void main(String[] args) {
		System.out.println(isPalindrome(98));
	}

}
