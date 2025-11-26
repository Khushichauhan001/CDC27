package Graph;
import java.util.*;
class Pair {
    int node;
    int weight;
    Pair(int node, int weight) {
        this.node = node;
        this.weight = weight;
    }
}
public class Dijisktra {
    public static int[] dijkstra(int V, int[][] edges, int src) {
      List<List<Pair>> adj = new ArrayList<>();
      for(int i=0;i<V ;i++){
        adj.add(new ArrayList<>());
      } 

      for(int[] e : edges){
        int u = e[0];
        int v = e[1];
        int  w = e[2];

            adj.get(u).add(new Pair(v, w));
            adj.get(v).add(new Pair(u, w)); 
      }
         int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.weight - b.weight);
        pq.add(new Pair(src, 0));

          while (!pq.isEmpty()) {
            Pair curr = pq.poll();
            int node = curr.node;
            int wt = curr.weight;
                for (Pair n : adj.get(node)) {

                if (wt + n.weight < dist[n.node]) {
                    dist[n.node] = wt + n.weight;
                    pq.add(new Pair(n.node, dist[n.node]));
                }

            }
        }

        return dist;
    }
    public static void main(String[] args) {
         int V = 5;
        int[][] edges = {
            {0, 1, 2},
            {0, 2, 4},
            {1, 2, 1},
            {1, 3, 7},
            {2, 4, 3}
        };

        int src = 0;
        int[] result = dijkstra(V, edges, src);
        for (int d : result) System.out.print(d + " ");

    }
}
