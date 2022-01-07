package LeetCode;

import java.util.*;

//https://leetcode.com/problems/unique-number-of-occurrences/

public class p1207_Unique_Number_Occurrences {
	
public boolean uniqueOccurrences(int[] arr) {
        
        //loop through and insert
        Map<Integer, Integer> count = new HashMap<Integer, Integer>();
        for(int num: arr){
            count.put(num, count.getOrDefault(num,0)+1);
        }
        
        //to track the frequency of numbers
        List list = new ArrayList<>();
        
        for(int num:count.values()){
            if(list.contains(num)) {
                return false;
            }else list.add(num);
        }
        
        return true;
        
    }

}
