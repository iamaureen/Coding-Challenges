package LeetCode;

//problem statement: https://leetcode.com/problems/transpose-matrix/

public class transposeMatrix867 {
	
	public int[][] transpose(int[][] A) {
        //with transpose matrix, 3x2 becomes 2x3
        //rowxcol becomes colxrow
        int[][] trans_matrix = new int[A[0].length][A.length];
        
        for(int i=0;i<A[0].length;i++){
            for(int j=0;j<A.length;j++){
                //first element of every row becomes the elements of first row in the transpose
            	//draw in the transpose in hand to understand the i,j valuess
                trans_matrix[i][j] = A[j][i];
            }
        }
        
        return trans_matrix;
        
    }

}
