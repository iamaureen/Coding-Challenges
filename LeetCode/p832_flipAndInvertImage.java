package LeetCode;

//problem:https://leetcode.com/problems/flipping-an-image
//time: 20 minutes
public class p832_flipAndInvertImage{
	
	   public int[][] flipAndInvertImage(int[][] A) {
	        
		   int[][] flipped_image = new int[A.length][A[0].length];
		   
		   for(int i=0;i<A.length;i++) {
			   int m = 0;
			   for(int j=A[0].length-1;j>=0;j--) {
				   flipped_image[i][m++] = A[i][j];
			   }
		   }
		   
		   for(int i=0;i<flipped_image.length;i++) {
			   for(int j=0;j<flipped_image[0].length;j++) {
				   if(A[i][j] == 0) A[i][j] = 1;
		           else A[i][j] = 0;
			   }
				   
		   }
		   
		   return flipped_image;
	    }

}
