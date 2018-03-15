
import java.util.Hashtable;

public class firstRecurrentChar {
	
	public static void main(String[] args) {
		findFirstRecurrentChar("accbbc");
	}
	
	//o(n) approach
	public static void findFirstRecurrentChar(String input) {
		
		Hashtable<Character, Integer> ht = new Hashtable<Character,Integer>();
		
		for(int i=0; i<input.length(); i++) {
			char c = input.charAt(i);
			
			if(ht.get(c)!=null) {
				System.out.print(c);
				break;
			}
			else {
				ht.put(c, 1);
			}
			
		}
	}

}
