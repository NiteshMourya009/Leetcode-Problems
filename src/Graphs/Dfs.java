package Graphs;

import java.util.ArrayList;

public class Dfs {
    public static void dfs(int node, boolean[]vis, ArrayList<ArrayList<Integer>>adj, ArrayList<Integer>ls){
        vis[node]=true ;
        ls.add(node) ;

        for(int it: adj.get(node)){
            if(vis[it]==false){
                dfs(it,vis,adj, ls) ;
            }
        }
    }
    public static void main(String[] args) {
        int V = 6;  // Number of vertices
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(V);

        // Initialize adjacency list
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Adding edges
        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 1, 4);
        addEdge(adj, 2, 4);
        addEdge(adj, 3, 5);
        addEdge(adj, 4, 5);

        ArrayList<Integer> ls = new ArrayList<>() ;
        boolean[] vis= new boolean[V+1] ;
        vis[0]= true ;
        dfs(0,vis,adj,ls) ;

        // Printing BFS result
        System.out.println("Breadth-First Search starting from vertex 0:");
        for (int node : ls) {
            System.out.print(node + " ");
        }
        System.out.println();
    }

    // Helper method to add an undirected edge in the adjacency list
    public static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
    }
}
