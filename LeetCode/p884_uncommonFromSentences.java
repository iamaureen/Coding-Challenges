package LeetCode;

import java.util.*;

public class p884_uncommonFromSentences {
	

	public static String[] uncommonFromSentences(String A, String B) {
		
		String combine = A + " " + B;
		String[] words = combine.split(" ");
		
		HashMap <String, Integer> count = new HashMap<String, Integer> ();
		//getOrDefault() - returns default value whenever the value was not found using the key specified
		for(String word: words) {
			count.put(word, count.getOrDefault(word, 0)+1);
		}
		
		ArrayList<String> res = new ArrayList<>();
		//keySet() method is used to get a set view of the keys contained in the map.
        for (String w : count.keySet())
            if (count.get(w) == 1)
                res.add(w);
        
        return res.toArray(new String[0]);   
    }
	
	public static void main(String[] args) {
		System.out.print(uncommonFromSentences("this apple is sweet", "this apple is sour"));
	}

}
