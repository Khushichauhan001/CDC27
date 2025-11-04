import java.util.*;

public class NoOfRoutes{

    static int totalPaths = 0;

    static void solve(int row, int col, int[][] maze, int n, int[][] vis, int[] di, int[] dj) {
        // If destination reached
        if (row == n - 1 && col == n - 1) {
            totalPaths++;
            return;
        }

        // Mark current cell as visited
        vis[row][col] = 1;

        // Directions: Down, Left, Right, Up
        for (int idx = 0; idx < 4; idx++) {
            int newRow = row + di[idx];
            int newCol = col + dj[idx];

            // Check if valid move
            if (newRow >= 0 && newRow < n && newCol >= 0 && newCol < n
                    && maze[newRow][newCol] == 1 && vis[newRow][newCol] == 0) {
                solve(newRow, newCol, maze, n, vis, di, dj);
            }
        }

        // Backtrack: unmark current cell
        vis[row][col] = 0;
    }

    static int countUniquePaths(int[][] maze) {
        int n = maze.length;
        int[][] vis = new int[n][n];
        totalPaths = 0;

        if (maze[0][0] == 0 || maze[n - 1][n - 1] == 0)
            return 0; // No possible path if start or end is blocked

        int[] di = {1, 0, 0, -1}; // D, L, R, U
        int[] dj = {0, -1, 1, 0};

        solve(0, 0, maze, n, vis, di, dj);
        return totalPaths;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of maze (n): ");
        int n = sc.nextInt();

        int[][] maze = new int[n][n];
        System.out.println("Enter the maze (0 for blocked, 1 for open):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                maze[i][j] = sc.nextInt();
            }
        }

        int result = countUniquePaths(maze);
        System.out.println("Total number of unique paths: " + result);

        sc.close();
    }
}
