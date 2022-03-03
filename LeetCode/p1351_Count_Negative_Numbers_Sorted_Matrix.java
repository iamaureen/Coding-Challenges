package LeetCode;

import java.util.HashMap;

//https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/

public class p1351_Count_Negative_Numbers_Sorted_Matrix{
	
public int countNegatives(int[][] grid) {
        
        //approach 1: brute-force  - o(mxn) solution
        int count=0;
        for(int i=0; i<grid.length ; i++){
            for(int j=0; j<grid[0].length ; j++){
                if(grid[i][j]<0){
                    count++;
                }
            }
        }
        return count;
        
    }
}
