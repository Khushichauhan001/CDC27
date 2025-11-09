import java.util.LinkedList;
import java.util.Queue;

public class ShortesPathInABinaryMatrix {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length ;
        if(grid[0][0] == 1) return -1 ;
        if(n == 1) return 1 ;
        boolean[][] vis = new boolean[n][n];
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0,0,1});
        vis[0][0] = true ;

        int[][] dirs = {
            {-1, -1} ,{-1, 0}, {-1,1}, {0,-1} , {0,1} , {1,-1}  , {1,0} , {1,1}
        };

        while(!q.isEmpty()){
            int[] cur = q.poll();
            int r = cur[0];
            int c = cur[1];
            int d = cur[2];
            if( r== n-1 && c ==n-1) return d ;

            for(int[] dir : dirs){
                int nr = r+dir[0];
                int nc = c+ dir[1];

                if(nr >=0 && nr < n && nc >=0 && nc <n && !vis[nr][nc]  && grid[nr][nc] == 0){
                    vis[nr][nc] = true ;
                    q.add(new int[]{nr , nc , d+1});
                }
            }
        }
        return -1 ;
    }
}
