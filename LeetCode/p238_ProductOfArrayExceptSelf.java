package LeetCode;


//problem definition: https://leetcode.com/problems/product-of-array-except-self/

public class p238_ProductOfArrayExceptSelf {
public int[] productExceptSelf(int[] nums) {
        
        //approach: brute force solution with o(n2) and causes TLE
        /* int[] answer = new int[nums.length]; 
        Arrays.fill(answer, 1); //initiate answer elements to 1
        
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(i==j) continue;
                else if(nums[j] == 0){
                    answer[i] = 0;
                    continue;
                }
                else answer[i] *= nums[j];
            }
        }
        
        return answer; */
        
        //approach 2: division - product of elements in a given array, then for each element x of the array, we can simply divide the product by x
        //handle use case where input has 0 
        //use case 1 - one zero in the input, need to keep track as except this all other will be 0
        //use case 2 - multiple zeros in the input, the result array will be 0 as no matter what everytime there will be 0 as the multiplier. 
        
       /*  int[] answer = new int[nums.length]; //initializes to 0
        int zero_count = 0;
        
        int product = 1;
        
        for (int i=0; i < nums.length; i++){
            if(nums[i] == 0){
                zero_count++;
                if(zero_count > 1) return answer;
            }else{
                //if you don't put this inside else, the product will become 0 due to the 0
                product *= nums[i];
            }
        }
        
        for(int i=0; i < nums.length; i++){
            
            if(zero_count == 1){
                //when only 1 zero, then product only on that index, rest of them are 0;
                if(nums[i] == 0) answer[i] = product;
                else answer[i] = 0;
                
            }else{
                
                answer[i] = product/nums[i];
            }
            
        }
        
        return answer; */
        
        //approach 3: without the division operation
        //example here: https://mahfuzsust.medium.com/product-of-array-except-self-8b8eae501c5d
        int[] left = new int[nums.length];
        left[0] = 1; //set default value
        for(int i=1; i< nums.length; i++){
            left[i] = left[i-1]*nums[i-1];
        }
        
        int[] right = new int[nums.length];
        right[nums.length-1] = 1; //set default value
        for(int i=nums.length-2; i >= 0; i--){
            right[i] = right[i+1]*nums[i+1];
        }
        
        //int[] answer = new int[nums.length];
        for(int i=0; i < nums.length; i++){
            //answer[i] = left[i]*right[i];
            nums[i] = left[i]*right[i];
        }
        
        //return answer;
        return nums;
    }
	

}
