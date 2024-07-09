package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Detect_Cycle {
    static class Pair{
        int first ;
        int second ;
        public Pair(int first, int second){
            this.first= first ;
            this.second= second ;
        }
    }
    public static boolean checkCycle(int src, int V, ArrayList<ArrayList<Integer>>adj, boolean[]vis ){

        vis[src]= true ;
        Queue<Pair> q= new LinkedList<>() ;
        q.add(new Pair(src, -1)) ;

        while(!q.isEmpty()){
            int node =q.peek().first ;
            int parent= q.peek().second ;
            q.remove() ;

             for(int adjacentNode: adj.get(node)){
                if(vis[adjacentNode]== false){
                    vis[adjacentNode]= true ;
                    q.add(new Pair(adjacentNode,node)) ;
                }
                else if(parent != adjacentNode){
                    return true ;
                }
            }
        }
        return false ;
    }
    public static boolean isCycle(int V, ArrayList<ArrayList<Integer>>adj){
        boolean vis[]= new boolean[V] ;
        for(int i=0; i<V; i++){
            vis[i]= false ;
        }
        for(int i=0; i<V; i++){
            if(vis[i]==false){
                if(checkCycle(i, V, adj, vis)) return true ;
            }
        }
        return false;
    }
    public static void main(String[] args) {
         char[][]grid= {{'a','a','a','a'},{'a', 'b','b','a'},{'a','b','b','a'},{'a','a','a','a'}};
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(grid.length);

        // Initialize adjacency list
        for (int i = 0; i < grid.length; i++) {
            adj.add(new ArrayList<>());
        }

        System.out.println(isCycle(grid.length,adj));
    }
}
