package GraphProblems;

import java.util.Iterator;
import java.util.LinkedList;

public class dfs {
	
	private int nodes;
	private LinkedList<Integer> adj[]; //an array of linked list
	
	//constructor
	dfs(int n){
		nodes = n;
		adj = new LinkedList[n]; //create an array with type LinkedList
		for (int i = 0; i < n; i++) {
			adj[i] = new LinkedList();
		}
	}
	
	//funtion to add edge 
	void addEdge(int v, int w) {
		adj[v].add(w); //add w to the v's list.
	}
	
	void dfsFunc(int src, boolean visited[]) {
		
		visited[src] = true;
		System.out.println(src+" ");
				
		//get adjacent vertices of the removed node, if adjacent is not visited, mark it visited
		Iterator<Integer> i = adj[src].listIterator(); 
		while(i.hasNext()) {
			int n = i.next();
			if(!visited[n]) {
				dfsFunc(n, visited);
			}
		}
					
	}
		
	
	//print BFS traversal from a given source s
	void printPath(int source) {
		//set all vertices as not visited
		boolean visited[] = new boolean[nodes];
		
		dfsFunc(source,visited);
	
	}
	
	public static void main(String args[])
    {
        dfs g = new dfs(4);
 
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
 
        System.out.println("Following is Breadth First Traversal "+
                           "(starting from vertex 2)");
 
        g.printPath(2);
    }

}
