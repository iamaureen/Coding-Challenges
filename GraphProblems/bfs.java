package GraphProblems;

import java.util.*;

//this class represents a directed graph using adjacency list representation
public class bfs {
	
	private int nodes;
	private LinkedList<Integer> adj[]; //an array of linked list
	
	//constructor
	bfs(int n){
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
	
	//print BFS traversal from a given source s
	void printPath(int source) {
		//set all vertices as not visited
		boolean visited[] = new boolean[nodes];
		
		//queue for BFS - for queue we used linkedlist
		LinkedList<Integer> queue = new LinkedList<Integer>();
		
		visited[source] = true;
		queue.add(source);
		
		while(queue.size()!=0) {
			
			source = queue.poll(); //poll() removes and returns the head of the linked list.
			System.out.println(source+" ");
			
			//get adjacent vertices of the removed node, if adjacent is not visited, mark it visited
			Iterator<Integer> i = adj[source].listIterator(); 
			while(i.hasNext()) {
				int n = i.next();
				if(!visited[n]) {
					visited[n] = true;
					queue.add(n);
				}
			}
			
		}
		
		
	}
	
	public static void main(String args[])
    {
        bfs g = new bfs(4);
 
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
