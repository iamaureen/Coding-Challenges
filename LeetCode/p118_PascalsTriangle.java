package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//problem: https://leetcode.com/problems/pascals-triangle/
//explanation: https://www.youtube.com/watch?v=icoql2WKmbA

public class p118_PascalsTriangle {
	
public List<Integer> getRow(int rowIndex) {
        
        //first declare the datastructure to hold the triangle
        List<List<Integer>> triangle = new ArrayList<>();
        
        //same algorithm to populate the triangle
        List<Integer> first_row = new ArrayList<>();
        first_row.add(1);
        
        triangle.add(first_row);
        
        for(int i=1;i<=rowIndex;i++){
            List<Integer> current_row = new ArrayList<>();
            List<Integer> previous_row = triangle.get(i-1);
            current_row.add(1);
            
            for(int j=1;j<i;j++){
                current_row.add(previous_row.get(j-1) + previous_row.get(j));
            }
            
            current_row.add(1);
        
            triangle.add(current_row);
            
        }
        
        return triangle.get(rowIndex);
        
    }
	
	

}
