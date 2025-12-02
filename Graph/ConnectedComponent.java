package Graph;

import java.util.ArrayList;

public class ConnectedComponent {
     static void dfs(ArrayList<ArrayList<Integer>> adj,
           boolean[] visited, int s, ArrayList<Integer> res) {
        visited[s] = true;
        res.add(s);

        // Recursively visit all adjacent 
        // vertices that are not visited yet
        for (int i : adj.get(s)) {
            if (!visited[i]) {
                dfs(adj, visited, i, res);
            }
        }
    }

    public static ArrayList<ArrayList<Integer>>
    getComponents(ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[adj.size()];
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();

        // Loop through all vertices 
        // to handle all components
        for (int i = 0; i < adj.size(); i++) {
            if (!visited[i]) {
                ArrayList<Integer> component = new ArrayList<>();
                dfs(adj, visited, i, component);
                res.add(component);
            }
        }

        return res;
}
}