package LeetCode;


//problem definition: https://leetcode.com/problems/add-digits/

public class p258_Add_digits {
public int addDigits(int num) {
        
        int sum = 0;
        
        
        while(num > 0){
            
            sum += num % 10;
            num = num / 10; 
            
            //need to add num == 0 otherwise wrong answer - check num=119
            //at one iteration, the sum becomes greater than 9 however num remains 1 - w/o num == 0 it resets. 
            //so need to add this.
            if(num == 0 && sum>9){
                num = sum;
                sum = 0;
            }
            
        
        }
        
        return sum;
        
    }
	

}
