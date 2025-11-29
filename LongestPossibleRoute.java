public class LongestPossibleRoute {
    private static boolean isSafe(int[][] mat , boolean[][] vis , int x  , int y){
        return (x>=0 && x <mat.length && y>=0 && y <mat[0].length) && mat[x][y] == 1 && !vis[x][y] ;
    }

    public static int findLongestRoute(int[][]mat , boolean[][] vis , int i , int j , int x , int y , int max_dist , int dist){
        if(mat[i][j] == 0) return 0 ;
        if(i==x && j ==y) return Integer.max(dist , max_dist);
          vis[i][j] = true ;

          if(isSafe(mat, vis, i+1 , j)){
            max_dist = findLongestRoute(mat, vis, i+1, j, x, y, max_dist, dist+1);
            
          }
          if(isSafe(mat, vis, i, j+1)){

            max_dist = findLongestRoute(mat, vis, i, j + 1, x, y,
                    max_dist, dist + 1);
          }
           if (isSafe(mat, vis, i, j - 1))
        {
            max_dist = findLongestRoute(mat, vis, i, j - 1, x, y,
                    max_dist, dist + 1);
        }
           vis[i][j] = false;
 
        return max_dist;
    }




      public static int findLongestPathLength(int[][] mat, int i, int j, int x, int y)
    {
        if (mat == null || mat.length == 0 || mat[i][j] == 0 || mat[x][y] == 0) {
            return -1;
        }
        int M = mat.length;
        int N = mat[0].length;
        boolean[][] visited= new boolean[M][N];

        return findLongestRoute(mat, visited, i, j, x, y, 0, 0);
    }
 
    public static void main(String[] args)
    {
        int mat[][] =
                {
                        { 1, 0, 1, 1, 1, 1, 0, 1, 1, 1 },
                        { 1, 0, 1, 0, 1, 1, 1, 0, 1, 1 },
                        { 1, 1, 1, 0, 1, 1, 0, 1, 0, 1 },
                        { 0, 0, 0, 0, 1, 0, 0, 1, 0, 0 },
                        { 1, 0, 0, 0, 1, 1, 1, 1, 1, 1 },
                        { 1, 1, 1, 1, 1, 1, 1, 1, 1, 0 },
                        { 1, 0, 0, 0, 1, 0, 0, 1, 0, 1 },
                        { 1, 0, 1, 1, 1, 1, 0, 0, 1, 1 },
                        { 1, 1, 0, 0, 1, 0, 0, 0, 0, 1 },
                        { 1, 0, 1, 1, 1, 1, 0, 1, 0, 0 }
                };
        int max_dist = findLongestPathLength(mat, 0, 0, 5, 7);
        System.out.println("The maximum length path is " + max_dist);
    }
}
