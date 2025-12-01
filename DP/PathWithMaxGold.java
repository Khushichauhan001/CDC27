package DP ;
public class PathWithMaxGold {
         int maxGold = 0 ;
    public int getMaximumGold(int[][] grid) {
        int m = grid.length ;
        int n = grid[0].length ;
        for(int i=0;i<m ;i++){
            for(int j=0 ;j< n ;j++){
                if(grid[i][j] > 0){
                    dfs(grid ,i , j , 0);
                }
            }
        }
        return maxGold ;
    }

    private void dfs(int[][] grid ,int i , int j , int currentGold){
        int m = grid.length ;
        int n = grid[0].length ;
       if (i < 0 || j < 0 || i >= m || j >= n || grid[i][j] == 0) return;
        
        int gold = grid[i][j];
        currentGold += gold;
        // int maxGold =0;
       maxGold = Math.max(maxGold, currentGold);
        grid[i][j] = 0;
        dfs(grid, i + 1, j, currentGold);
        dfs(grid, i - 1, j, currentGold);
        dfs(grid, i, j + 1, currentGold);
        dfs(grid, i, j - 1, currentGold);
        
        grid[i][j] = gold;
    }
}
