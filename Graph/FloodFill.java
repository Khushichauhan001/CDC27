package Graph;

public class FloodFill {
      private void dfs(int[][] image , int[][] ans , int row , int col ,int[] delRow, int[] delCol , int color  , int initialCol){
             ans[row][col] = color;
             int n = image.length;
             int m = image[0].length;

             for(int i=0 ; i< 4 ; i++){
                int nrow = row+delRow[i];
                int ncol = col+delCol[i];

                if(nrow>=0 && nrow < n && ncol>=0 && ncol < m && image[nrow][ncol]== initialCol && ans[nrow][ncol] != color){
                    dfs(image , ans , nrow , ncol , delRow , delCol, color , initialCol);
                   
                }
             }

    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int initialCol = image[sr][sc];
        // int[][] ans = image;

        int[] delRow = {-1,0,1,0};
        int[] delCol = {0,1,0,-1};
        
        if(initialCol == color) return image ;
        int n = image.length ;
        int m = image[0].length;

          int[][] ans = new int[n][m];
        for(int i=0 ; i< n ;i++){
            for(int j=0 ; j<m;j++){
                ans[i][j] = image[i][j];
            }
        }

        dfs(image , ans , sr , sc , delRow , delCol , color , initialCol );
        return ans ;
    }
    
}
