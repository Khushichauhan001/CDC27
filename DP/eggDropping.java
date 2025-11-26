package DP;
//optimal
public class eggDropping {
     public int superEggDrop(int k, int n) {
        int[][] dp = new int[n + 1][k + 1];

        int moves = 0;

        while (dp[moves][k] < n) {
            moves++;

            for (int e = 1; e <= k; e++) {
                dp[moves][e] = dp[moves - 1][e - 1] + dp[moves - 1][e] + 1;
            }
        }

        return moves;
    }
}



// better 
// class Solution {
//     public int superEggDrop(int k, int n) {
//         int[][] dp = new int[k+1][n+1];

//         // Base cases
//         for (int i = 1; i <= k; i++) {
//             dp[i][0] = 0;
//             dp[i][1] = 1;
//         }
//         for (int j = 1; j <= n; j++) {
//             dp[1][j] = j;
//         }

//         for (int e = 2; e <= k; e++) {
//             for (int f = 2; f <= n; f++) {

//                 dp[e][f] = Integer.MAX_VALUE;

//                 for (int x = 1; x <= f; x++) {

//                     int eggBreak = dp[e - 1][x - 1];   
//                     int noBreak = dp[e][f - x];       

//                     int worst = 1 + Math.max(eggBreak, noBreak);

//                     dp[e][f] = Math.min(dp[e][f], worst);
//                 }
//             }
//         }

//         return dp[k][n];
//     }
// }
