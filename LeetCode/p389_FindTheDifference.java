package LeetCode;

public class p389_FindTheDifference {
	
	public static char findTheDifference(String s, String t) {
		
		//approach 1: bit manipulation approach
		char diff = 0;
		
		for (char c: s.toCharArray()) {
			diff = (char) (diff^c);
			
		}
		for (char c: t.toCharArray()) {
			diff = (char) (diff^c);
			
		}

		return diff;
		
		//approach 2: hash table approacch
		/* if(s==null) 
            return t.toCharArray()[0];
        
        //put string s into a hashmap
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        
        char ch = 0;
        //either it's a new letter OR the same letter added once so if the count is 0 it means that the current element is the extra letter
        for(char c:t.toCharArray()){
            if(!map.containsKey(c) || map.get(c)==0) {
                ch = c;
            }else{
                map.put(c,map.get(c)-1);
            }
        }
        
        return ch; */
    
    }
	
	public static void main(String[] args) {
		//System.out.println(findTheDifference("abcd", "abcde"));
		
		String s = "abcd";
		String t = "abcde";
		System.out.println(s+t);
		
	}

}
