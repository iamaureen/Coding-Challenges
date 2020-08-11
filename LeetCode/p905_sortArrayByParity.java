package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class p905_sortArrayByParity {
	
	public static int[] sortArrayByParity(int[] A) {
		
		//version 1: using arraylist
//		//declare two arraylists - one for odd elements, one for even elements
//		ArrayList<Integer> even_list = new ArrayList<Integer>();
//		ArrayList<Integer> odd_list = new ArrayList<Integer>();
//	
//		
//		for(int i=0;i<A.length;i++) {
//			if(A[i] % 2 == 0) even_list.add(A[i]);
//			else odd_list.add(A[i]);
//		}
//		
//		ArrayList<Integer> merged_list = new ArrayList<Integer>();
//		merged_list.addAll(even_list);
//		merged_list.addAll(odd_list);
//		
//		
//		//convert to primitive int array
//		int[] arr = new int[merged_list.size()];
//		for(int i = 0; i < merged_list.size(); i++) {
//		    arr[i] = merged_list.get(i);
//		}
//		
//		System.out.println(Arrays.toString(arr));
//		return arr;
		
		//version 2: using another array
		int[] B = new int[A.length];
		int start_index = 0;
		int end_index = A.length - 1;
		
		for(int i=0;i<A.length;i++) {
			if(A[i] % 2 == 0) {
				B[start_index++] = A[i];
			}else {
				B[end_index--] = A[i];
			}
		}
		
		//System.out.println(Arrays.toString(B));
		return B;
		
        
    }
	
	public static void main(String[] args) {
		int[] input = {4,5,2,6,7};
		sortArrayByParity(input);
	}

}
