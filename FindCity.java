public class FindCity {
     public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int m = edges.length ;
        int[][] dist = new int[n][n];
        for(int i=0 ;i<n;i++){
            for(int j=0;j<n;j++){
             dist[i][j] = (i == j) ? 0 : Integer.MAX_VALUE;
            }

        }
         for (int[] e : edges) {
            int u = e[0], v = e[1], w = e[2];
            dist[u][v] = w;
            dist[v][u] = w;
        }

        // for(int i=0  ;i<n;i++){
        //     dist[i][i] = 0;
        //  }
         for(int k=0 ;k<n;k++){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(dist[i][k] != Integer.MAX_VALUE && dist[k][j] != Integer.MAX_VALUE ){
                        dist[i][j] = Math.min(dist[i][j] , dist[i][k] + dist[k][j]);
                    }
                }
            }
         }

       int cntCity = n ;
       int cityNo = -1 ;
       for(int city =0;city <n;city++){
        int count =0;
        for(int adjCity =0; adjCity <n;adjCity++){
            if(dist[city][adjCity] <= distanceThreshold){
                count++;
            }
        }
        if(count <= cntCity){
            cntCity = count ;
            cityNo = city ;
        }
       }
       return cityNo;

    }
}
