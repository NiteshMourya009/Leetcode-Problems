package Graphs;
import java.util.* ;
public class BipartiteGraph {

    public static boolean check(int start, int V, ArrayList<ArrayList<Integer>>adj, int[]color){
        Queue<Integer> q= new LinkedList<>() ;
        q.add(start);
        color[start] =0 ;
        while(!q.isEmpty()){
            int node = q.peek() ;
            q.remove() ;

            for(int it: adj.get(node)) {
                if(color[it] ==-1){
                    color[it] = 1- color[node] ;
                    q.add(it);

                }
                else if(color[it] == color[node]){
                    return false ;
                }
            }
        }
       return true ;
    }
    public static boolean isBipartite(int V, ArrayList<ArrayList<Integer>>adj){
        int[]color =new int[V] ;
        for(int i=0; i<V; i++){
            color[i]= -1 ;
        }
        for(int i=0; i<V; i++){
            if(color[i]==-1){
                if(check(i, V, adj, color)==false){
                    return false;
                }
            }
        }
        return true ;
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Add edges to the graph
        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(2).add(3);
        adj.get(3).add(2);
        adj.get(3).add(4);
        adj.get(4).add(3);

        System.out.println(isBipartite(V,adj));
    }
}
