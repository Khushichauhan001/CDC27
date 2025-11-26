package Recursion;
import java.util.ArrayList;
import java.util.Scanner;

public class RatinaMaze {
    static void solve(int row , int col , int[][] maze , int n , ArrayList<String> ans , String s , int[][] vis , int[] di , int[] dj){
        if( row == n-1 && col == n-1){
            ans.add(s);
            return ;
        }
        String dir = "DLRU";
        for(int idx = 0 ;idx < 4;idx++){
            int i = row+di[idx];
            int j = col+dj[idx];
            
                vis[row][col]  = 1;
            if(i>=0 && i<n && j>=0 && j< n && vis[i][j] == 0 && maze[i][j] ==1){
              
                solve(i , j , maze , n , ans ,s+dir.charAt(idx), vis , di, dj);
            }
            vis[row][col] = 0 ;
        }
    }
    public static ArrayList<String> ratInMaze(int[][] maze) {
        // code here
        int n = maze.length ;
        int[][] vis = new int[n][n];
        for(int i=0 ;i< n ;i++){
            for(int j = 0 ;j<n ;j++){
                vis[i][j] = 0 ;
            }
        }
        
        ArrayList<String> ans = new ArrayList<>();
      int[] di = {1, 0, 0, -1};   // D, L, R, U
int[] dj = {0, -1, 1, 0};
        
        if(maze[0][0] == 1){
            solve(0 , 0 , maze , n , ans , "" , vis , di , dj);
        }
        return ans;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of maze (n): ");
        int n = sc.nextInt();

        int[][] maze = new int[n][n];
        System.out.println("Enter the maze matrix (0 for blocked, 1 for open):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                maze[i][j] = sc.nextInt();
            }
        }

        ArrayList<String> paths = ratInMaze(maze);

        if (paths.size() == 0) {
            System.out.println("No path found!");
        } else {
            System.out.println("Possible paths are:");
            for (String path : paths) {
                System.out.println(path);
            }
        }

        sc.close();
    }
}
