package Graph;
public class FloydsWrshal {
    public void floydWarshall(int[][] dist) {
        int n = dist.length;
        final int INF = (int)1e8; 

        for (int i = 0; i < n; i++) {
            // for (int j = 0; j < n; j++) {
                // if(dist[i][j] == INF  )
                //     dist[i][j] = INF;
                // if (i == j)
                    dist[i][i] = 0;
            // }
        }

        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (dist[i][k] < INF && dist[k][j] < INF) {
                        long newDist = (long)dist[i][k] +(long)dist[k][j];
                        if(newDist< dist[i][j]){
                            dist[i][j] = (int)newDist ;
                        }
                        // dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
                    }
                }
            }
        }

    
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n; j++) {
        //          if (dist[i][j] == INF || dist[i][j] >= 99999999) {
        //             dist[i][j] = -1;
        //         }
        //     }
        // }
    }
}
