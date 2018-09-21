package GraphProblems;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class iddfs {
	
	private int target;
	private LinkedList<Integer> adj[]; //an array of linked list for neighbours
	private boolean found=false;
	private int d[];
	
	//constructor
	public iddfs(int totalnodes, int target) {
		this.target = target;
		
		adj = new LinkedList[totalnodes];
		d = new int[totalnodes];
		
		for (int i = 0; i < totalnodes; i++) {
			adj[i] = new LinkedList();
			
			
		}
	}
	
	//funtion to add edge 
	void addEdge(int v, int w) {
		adj[v].add(w); //add w to the v's list.
	}
	
	//
	public void iterativeDeepening(int src) {
		int depth = 0; //at the beginning, depth will be 0
		
		while(!found) {
			dfs(src, depth);
			depth++; //increase the depth
			
		}
	}
	
	public void dfs(int src, int maxDepth) {
		Stack<Integer> stack = new Stack<Integer>();
		d[src] = 0; //start from the beginning each time
		stack.push(src);
	
		
		while(!stack.isEmpty()) {
			int x = stack.pop();
			System.out.println("x :: "+x);
			
			if(x == this.target) {
				System.out.println("Found");
				this.found = true;
				return;
			}
			
			if(d[src]>=maxDepth) {
				continue;
			}
			
			Iterator<Integer> i = adj[src].listIterator(); 
			while(i.hasNext()) {
				int n = i.next();
				d[src]++;
				stack.push(n);
			}
				
		}
	}
		

	
	public static void main(String args[])
    {
		iddfs g = new iddfs(7, 6);
		 
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 5);
        g.addEdge(2, 6);
        

        g.iterativeDeepening(0);
    }

}
