package LeetCode;


//heap solution explanation - https://www.youtube.com/watch?v=FrWq2rznPLQ

import java.util.*;

public class p347_top_k_frequent_elements {
	
public static void topKFrequent(int[] nums, int k) {
        
        //build a frequency hash-map
        Map<Integer, Integer> freq = new HashMap();
        
        for (int n:nums){
            freq.put(n, freq.getOrDefault(n,0) + 1);
        }
        
        //System.out.println(freq);
        
        //PriorityQueue<Integer> minHeap = new PriorityQueue<>(); 
        //we need a minHeap using the frequency not the key values; so we use the following:
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((n1, n2) -> freq.get(n1) - freq.get(n2));
        
        for(int n:freq.keySet()){
        	//System.out.println("key: " + n + " value: " + freq.get(n));
            minHeap.add(n);
            if(minHeap.size() > k) minHeap.remove();
        }
        
        //print minHeap
        System.out.println(minHeap);
        
        int[] top = new int[k];
        for(int i = 0; i<k; i++){
            top[i] = minHeap.remove();
        }
        
        System.out.println(Arrays.toString(top));
        //return top;
        
    }
	
	
	public static void main(String[] args) {
		int[] nums = {1,1,1,2,2,3};
		
		topKFrequent(nums, 2);
	}

}
