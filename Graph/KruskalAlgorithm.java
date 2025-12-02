package Graph;
import java.util.*;

class Edge implements Comparable<Edge> {
    int src, dest, wt;

    Edge(int s, int d, int w) {
        src = s;
        dest = d;
        wt = w;
    }

    public int compareTo(Edge other) {
        return this.wt - other.wt;
    }
}

public class KruskalAlgorithm {

    static int find(int parent[], int x) {
        if (parent[x] == x) return x;
        return parent[x] = find(parent, parent[x]);
    }

    static void union(int parent[], int rank[], int x, int y) {
        int rx = find(parent, x);
        int ry = find(parent, y);
        if (rx != ry) {
            if (rank[rx] < rank[ry]) parent[rx] = ry;
            else if (rank[rx] > rank[ry]) parent[ry] = rx;
            else parent[ry] = rx; rank[rx]++;
        }
    }

    public static void main(String[] args) {
        int V = 4;

        ArrayList<Edge> edges = new ArrayList<>();
        edges.add(new Edge(0, 1, 10));
        edges.add(new Edge(0, 2, 6));
        edges.add(new Edge(0, 3, 5));
        edges.add(new Edge(1, 3, 15));
        edges.add(new Edge(2, 3, 4));

        Collections.sort(edges);

        int[] parent = new int[V];
        int[] rank = new int[V];

        for (int i = 0; i < V; i++) parent[i] = i;

        System.out.println("Edges in MST:");
        for (Edge e : edges) {
            if (find(parent, e.src) != find(parent, e.dest)) {
                System.out.println(e.src + " - " + e.dest + " (weight " + e.wt + ")");
                union(parent, rank, e.src, e.dest);
            }
        }
    }
}
