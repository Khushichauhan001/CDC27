package Graph;

import java.util.ArrayList;

public class DFS {
      // Function to return a list containing the DFS traversal of the graph.
    public static void dfsGra(int s , boolean[] vis , ArrayList<ArrayList<Integer>> adj , ArrayList<Integer> l1){
        vis[s] = true ;
        l1.add(s);
        
        for(int it : adj.get(s)){
            if(vis[it] == false){
                dfsGra(it ,  vis , adj , l1);
            }
        }
    }
    public static ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> l1 = new ArrayList<>();
        int v = adj.size();
        int s =0;
        boolean[] vis = new boolean[v];
        
        vis[s] = true ;
        dfsGra(0,vis,adj,l1);
        return l1 ;
        
        
    }
}
