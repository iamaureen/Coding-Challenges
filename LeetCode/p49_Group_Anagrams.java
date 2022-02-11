package LeetCode;

import java.util.*;

//problem: https://leetcode.com/problems/group-anagrams/
//solution: https://www.youtube.com/watch?v=ptgykfAEax8

public class p49_Group_Anagrams {
	
	public List<List<String>> groupAnagrams(String[] strs) {
	        
	        //group of anagrams look the same when they are sorted
	        
	        List<List<String>> groupedAnagrams = new ArrayList<>();
	        
	        HashMap<String, List<String>> map = new HashMap<>();
	        
	        for(String current: strs){
	            
	            char[] characters = current.toCharArray();
	            Arrays.sort(characters);
	            String sorted = new String(characters);
	            
	            if(!map.containsKey(sorted)){
	                map.put(sorted, new ArrayList<>()); //creates a new list
	              
	            }
	            
	            map.get(sorted).add(current); //add the value
	            
	        }
	        
	        //map.values() returns the list<String> items
	        groupedAnagrams.addAll(map.values()); //in any order, order doesn't matter 
	        
	        return groupedAnagrams;
	        
	    }
}


