public class MInFishInAGrid {
     public int findMaxFish(int[][] grid) {
        int m = grid.length ;
        int n = grid[0].length ;
        boolean[][] vis = new boolean[m][n];
        int maxFish =0;

        for(int i=0 ;i< m ;i++){
            for(int j = 0;j<n;j++){
                if(grid[i][j] > 0 && !vis[i][j]){
                    maxFish = Math.max(maxFish, dfs(grid, vis , i , j , m , n ));
                }
            }
        }
        return maxFish ;
    }

    private int dfs(int[][] grid , boolean[][] vis , int i , int j , int m , int n ){
        if(i< 0 || i>= m || j <0 || j >=n ||vis[i][j] || grid[i][j] == 0){
            return 0 ;
        }
        vis[i][j]  = true ;
        int fish = grid[i][j];
         fish += dfs(grid , vis , i+1 , j , m , n );
         fish += dfs(grid ,vis , i-1 , j , m , n );
         fish += dfs(grid , vis , i , j+1 , m , n);
         fish+= dfs(grid, vis , i , j-1 , m , n );
         return fish ;
    }
}
