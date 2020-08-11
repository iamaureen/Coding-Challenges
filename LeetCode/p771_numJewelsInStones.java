package LeetCode;

//https://leetcode.com/problems/jewels-and-stones/description/

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class p771_numJewelsInStones {
	
	public static int numJewelsInStones(String J, String S) {
		
		//Brute Force Technique
		
		
		//O(N) of Technique
//		HashMap <Character, Integer> stones = new HashMap <Character, Integer>();
//		
//		//count different stones 
//		int stonesCount = 1;
//		for (int i = 0; i < S.length(); i++) {
//			
//			char stone = S.charAt(i);
//			//int stonesCount = 1; //made an initialization error here. (=0) + wrong placement
//								  //should be outside for loop, else everytime it is initialized to 
//									//1 hence incorrect count
//			if(stones.containsKey(stone)) {
//				
//				stonesCount = stones.get(stone);
//				stonesCount++; //only used this increment statement, instead of fetching value first;
//								//that is wrong too, because with each containskey=true it will
//								//increment regardless of the key value. so need to get associated value
//								//first then incremenet.
//				System.out.println("repeat stone " + stone + " stonecount " + stonesCount);
//				stones.put(stone, stonesCount);
//			}else {
//				stones.put(stone, 1); //stones.put(stone, stonesCount) incorrect
//									 // sample input: ("ace","dadc") when reached to c, stonesCount will be
//									 // 2, so when c is found first time, with this statement will initialize with
//									 // 2, which is wrong
//			}
//			
//		}
//		
//		//display hashmap
//		Set set = stones.entrySet();
//		Iterator iterator = set.iterator();
//	      while(iterator.hasNext()) {
//	         Map.Entry mentry = (Map.Entry)iterator.next();
//	         System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
//	         System.out.println(mentry.getValue());
//	      }
//		
//		//check for jewels
//		int jewelCount = 0;
//		for(int i = 0; i < J.length(); i ++ ) {
//			char jewel = J.charAt(i);
//			
//			if(stones.containsKey(jewel)) {
//				jewelCount += stones.get(jewel);
//			}
//			
//		}
//        
//		return jewelCount; 
		
			//solution without collection using boolean array
		 
		 	boolean[] map = new boolean[256]; //why size 256?
		 	for (char j : J.toCharArray()){
		 		map[j] = true;
		 	}
		 	int count = 0;
		 	
		 	for (char s : S.toCharArray()){
		 		if(map[s]) count ++;
		 	}
		 	
		 	return count;
		 	
		 	
		  
		  
    }
	
	public static void main(String[] args) {
		
		//System.out.println(numJewelsInStones("aA","aAAbbbb"));
		//System.out.println(numJewelsInStones("ebd","bbb"));
		System.out.println(numJewelsInStones("ace","dadc"));
	}

}
