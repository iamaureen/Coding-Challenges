package Hash;

import java.util.HashMap;

//https://www.geeksforgeeks.org/find-four-elements-a-b-c-and-d-in-an-array-such-that-ab-cd/

public class equalSum {
	
	//class to hold pairs
	class pair{
		int x,y;
		pair(int x, int y){
			this.x = x;
			this.y = y;
		}
	}
	
	//method to find equal pairs
	boolean findPairs(int[] arr) {
		//create hash table were sum will be index and x,y as pairs as values
		HashMap<Integer, pair> map = new HashMap<Integer, pair>();
		
		//loop through the array and sum them sequentiaylly
		//if the sum is not in the map, insert. if it is - return the pair.
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				int sum = arr[i] + arr[j];
				if(map.containsKey(sum)) {
					pair pair = map.get(sum);
					//print the previous pair
					//System.out.println(pair.x + " " +pair.y);
					
					//print both the pair, previous vs current one 
					System.out.println(pair.x + " " +pair.y + "\n" + arr[i] + " " + arr[j]);
					return true;
				}
				else {
					//insert into the map
					map.put(sum, new pair(arr[i],arr[j]));
				}
			}
		}
		return false;
		
	}
	
	// Testing program 
    public static void main(String args[]) 
    { 
        int arr[] = {3, 4, 7, 1, 12, 9};
        int arra[] = {65, 30, 7, 90, 1, 9, 8};
        equalSum a = new equalSum(); 
        if(!a.findPairs(arr)) {
        	System.out.println("no pairs found");
        }
    } 
}
