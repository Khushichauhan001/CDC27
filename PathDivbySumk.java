public class PathDivbySumk {
    private static final int MOD = 1000000007;
    public int numberOfPaths(int[][] grid, int k) {
        int m = grid.length ;
        int n = grid[0].length ;
        int[][][] dp = new int[m][n][k];
        int startRem= grid[0][0] % k ;
        dp[0][0][startRem] = 1;
         
        for(int i=0 ;i<m ;i++){
            for(int j =0 ;j<n ;j++){
            //   int val = grid[i][j];
              for(int rem =0 ;rem < k ;rem++){
                int ways = dp[i][j][rem];
                if(ways == 0) continue ;

                if(i+1 < m ){
                    int newRem = (rem+ grid[i+1][j]) % k ;
                    dp[i+1][j][newRem] = (dp[i+1][j][newRem] + ways) % MOD ;
                }
                if( j+1 < n ){
                    int newRem = (rem+ grid[i][j+1]) % k ;
                    dp[i][j+1][newRem] = (dp[i][j+1][newRem] + ways) % MOD ;
                }
              }
            }
        }
        return dp[m-1][n-1][0];
    }
}
