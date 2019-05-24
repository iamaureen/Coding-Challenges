package LeetCode;

import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

//problem: https://leetcode.com/problems/sort-characters-by-frequency
//coding explanation: https://www.youtube.com/watch?v=trFw8IDw2Vg
//asked in google

//steps followed: 
//1. count frequency
//2. sort (character, frequency) pair based on frequency
//3. loop through to output the string

//two versions here

//version 1 - creating a separate class
//public class SortCharactersByFrequency451 {
//	
//	public static String frequencySort(String s) {
//		if(s == null || s == "") return "";
//		
//		//count frequency
//		int[] arr = new int[256];
//		for(char c : s.toCharArray()) arr[c]++;
//		
//		//This creates a PriorityQueue with the specified initial capacity that 
//		//orders its elements according to the specified comparator.
//		PriorityQueue<Pair> pq = new PriorityQueue<>(s.length(), new Comparator<Pair>() {
//			public int compare(Pair p, Pair q) {
//				return q.frequency - p.frequency;
//			}
//		}); 
//		
//		//insert into priority queue
//		for(int i=0;i<arr.length;i++) {
//			//if count is greater than 0
//			if(arr[i]>0) {
//				pq.offer(new Pair(((char)i), arr[i])); //offer vs add. offer returns false
//													   //if cant insert whereas add returns exception
//			}
//		}
//		
//		//insertion done, sorted already 
//		//now retrieve
//		StringBuilder sb = new StringBuilder();
//		while(!pq.isEmpty()) {
//			Pair p = pq.poll(); //retrieves and removes the head of the queue, returns null if empty
//			while(p.frequency != 0) {
//				sb.append(p.c);
//				p.frequency--;
//			}
//		}
//		
//        return sb.toString();
//    }
//	
//	public static void main(String[] args) {
//		System.out.println(frequencySort("tree"));
//	}
//
//}
//
//class Pair{
//	int frequency;
//	char c;
//	
//	//constructor
//	public Pair(char c, int frequency) {
//		this.c = c;
//		this.frequency = frequency;
//	}
//}

//version-2 without creating a class
public class SortCharactersByFrequency451 {
	
	public static String frequencySort(String s) {
		//save the frequency in a hashmap - count every counter
		HashMap<Character, Integer> map = new HashMap<>();
		//
		for(char c:s.toCharArray()) map.put(c, map.getOrDefault(c, 0)+1);
		
		//need to make a maxHeap
		//maximum occuring character will be at the root
		//telling the heap how to compare two items - based on the count which is stored in the map
		PriorityQueue<Character> maxHeap = new PriorityQueue<Character>((a,b) -> map.get(b)-map.get(a));
		 
		//get everything in the hashmap and add in the PQ
		maxHeap.addAll(map.keySet());
		
		//move everything from heap to string builder
		StringBuilder result = new StringBuilder();
		while(!maxHeap.isEmpty()) {
			char current = maxHeap.remove();
			for(int i = 0; i < map.get(current); i++) result.append(current);
		}
		
		return result.toString();
    }
	
	public static void main(String[] args) {
		System.out.println(frequencySort("tree"));
	}

}


