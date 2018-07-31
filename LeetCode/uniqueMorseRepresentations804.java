package LeetCode;

//https://leetcode.com/problems/unique-morse-code-words/description/
//answer provided by leetcode: https://leetcode.com/articles/unique-morse-code-words/
//took 7ms

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class uniqueMorseRepresentations804 {
	
	public static int uniqueMorseRepresentations(String[] words) {
		
		String[] codeReference = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
		HashMap <Character, String> ref = new HashMap <Character, String>();
		
		//create a hashmap mapping alphabets with given morse codes
		int i = 0;
		for (char alphabet = 'a'; alphabet <= 'z'; alphabet++) {
			ref.put(alphabet, codeReference[i]);
			i++;					
		}
		
//		//display hashmap
//		Set set = ref.entrySet();
//		Iterator iterator = set.iterator();
//	      while(iterator.hasNext()) {
//	         Map.Entry mentry = (Map.Entry)iterator.next();
//	         System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
//	         System.out.println(mentry.getValue());
//	      }
		
		Set <String> transformedSet = new HashSet <String>();
		//loop through the words and transform them into morsecode
		//String[] words = {"gin", "zen", "gig", "msg"};
		for (int j = 0; j < words.length; j++) {
		
		String transform = "";
		String word = words[j];
		for (char c: word.toCharArray()) {
				transform += ref.get(c);
			}
		
		//insert into set
		transformedSet.add(transform);
	 }
		//System.out.println(transformedSet.size());
		return transformedSet.size();
        
    }
	
	public static void main(String[] args) {
		
		String[] words = {"gin", "zen", "gig", "msg"};
		int diffTransformations = uniqueMorseRepresentations(words);
		System.out.println(diffTransformations);
			
	}

}
