package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//problem: https://leetcode.com/problems/pascals-triangle/
//explanation: https://www.youtube.com/watch?v=icoql2WKmbA

public class p118_PascalsTriangle {
	
	public  List<List<Integer>> generate(int numRows) {
        
        //approach 1: dynamic programming
        //we used arraylist because we don't know the length of each row before
        //first we declare the data structure that we need to return
        
        List<List<Integer>> triangle = new ArrayList<>();
        
        //edge case
        if (numRows == 0) return triangle;
        
        //insert the first element in the list as it is always 1. 
        //the element is a list of integer (1);
        List<Integer> first_row = new ArrayList<>();
        first_row.add(1); //add 1 to it. 
        triangle.add (first_row); //add the first row in the trinagle
        
        //now we use this first row, create a double for loop to populate the rest of the rows
        //outer loop starts from 1, since we already have the first element
        for(int i=1; i<numRows; i++){
            
            //create a list for the current row
            List<Integer> current_row = new ArrayList<>();
            
            //get the previous row 
            List<Integer> previous_row = new ArrayList<> ();
            previous_row = triangle.get(i-1);
            
            //all the rows start with 1, so add it
            current_row.add(1);
            
            //the inner for loop to populate the numbers
            //already add 1, so loop starts rrom the second element
            for(int j=1;j<i;j++){
                current_row.add(previous_row.get(j-1) + previous_row.get(j));
            }
                
            //all the rows end with 1, so add it
            current_row.add(1);
            
            //add the current row in the triangle
            triangle.add(current_row);
        }
        
        return triangle;
        
    }
	
	

}
