package Tree;
import java.util.*;

public class DisjointSet {
    List<Integer> rank = new ArrayList<>();
      List<Integer> parent = new ArrayList<>();
      List<Integer> size = new ArrayList<>();
        public DisjointSet(int n) {
      for(int i=0 ;i<n ;i++){
        rank.add(0);
        parent.add(i);
     size.add(1);
      }
    }


    public int findUpperParent(int node) {
        if(node == parent.get(node)){

            return node ;
        }
        int ulp = findUpperParent(parent.get(node));
        parent.set(node, ulp);  // hmesa ke lie uska parent set krdo 
        return parent.get(node);
    }

    public void unionByRank(int u, int v) {
        int ulp_u = findUpperParent(u);
        int ulp_v = findUpperParent(v);
        if(ulp_u == ulp_v) return ;
        if(rank.get(ulp_u) < rank.get(ulp_v)){
            parent.set(ulp_u, ulp_v);
        }
        else if(rank.get(ulp_v)< rank.get(ulp_u)){
            parent.set(ulp_v, ulp_u);
        }
        else {
          parent.set(ulp_v, ulp_u);
          int rankU = rank.get(ulp_u);
          rank.set(ulp_u, rankU+1);
        }
    }

    public void unionBySize(int u, int v) {
         int ulp_u = findUpperParent(u);
        int ulp_v = findUpperParent(v);
        if(ulp_u == ulp_v) return ;
        if(size.get(ulp_u) < size.get(ulp_v)){
            parent.set(ulp_u, ulp_v);
            size.set(ulp_v , size.get(ulp_u)+size.get(ulp_v));
        }
        else if(size.get(ulp_v)< size.get(ulp_u)){
            parent.set(ulp_v, ulp_u);
            size.set(ulp_u , size.get(ulp_u)+size.get(ulp_v));
        }
    }

    public static void main(String[] args) {
         DisjointSet ds = new DisjointSet(8);
        ds.unionBySize(1, 2);
        ds.unionBySize(2, 3);
        ds.unionBySize(4, 5);
        ds.unionBySize(6, 7);
        ds.unionBySize(5, 6);

        // if 3 and 7 same or not
        if (ds.findUpperParent(3) == ds.findUpperParent(7)) {
            System.out.println("Same");
        } else
            System.out.println("Not Same");

        ds.unionBySize(3, 7);
        if (ds.findUpperParent(3) == ds.findUpperParent(7)) {
            System.out.println("Same");
        } else
            System.out.println("Not Same");
    }
}
