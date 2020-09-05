package LeetCode;


//problem definition: https://leetcode.com/problems/product-of-array-except-self/

public class p217_ContainsDuplicate {
	 public int[] productExceptSelf(int[] nums) {
	        
//       //Brute Force Technique:
//       //time: o(n^2)
//       //space: o(1)
//       //create an array for the result
//       int[] result = new int[nums.length];
      
//       for(int i=0;i<nums.length;i++){
//           int mult = 1; 
//           for(int j=0;j<nums.length;j++){
//               if(i==j) continue; 
//               else{
//                   mult *= nums[j];
//               }
//               result[i] = mult;
//           }
//       }
      
//       return result;
      
//   }
      
      //time: o(n) -- without using division
      //https://leetcode.com/problems/product-of-array-except-self/solution/
      int[] left_products = new int[nums.length];
      int[] right_products = new int[nums.length];
      
      //output array
      int[] output = new int[nums.length];
      
      left_products[0] = 1; 
      right_products[nums.length-1] = 1;
      
      //forward loop and fill left product -- for each element multiply what is before that element
      for(int i=1; i<nums.length;i++){
          left_products[i] = nums[i-1]*left_products[i-1];
      }
      
      //backward loop and fill right product -- for each element multiply what is after that element
      for(int i=nums.length-2; i>=0;i--){
          right_products[i] = nums[i+1]*right_products[i+1];
      }
      
      for(int i=0;i<nums.length;i++) {
          output[i] = left_products[i]*right_products[i];
      }
      
      return output;
  }
	

}
