package DP;

import java.util.Arrays;

public class MaxSumDivby3 {
     public int maxSumDivThree(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n + 1][3];
        for (int i = 0; i <= n; i++) {
            Arrays.fill(dp[i], Integer.MIN_VALUE);
        }

        dp[0][0] = 0;

        for (int i = 1; i <= n; i++) {
            int num = nums[i - 1];
            int rem = num % 3;

            for (int r = 0; r < 3; r++) {
                dp[i][r] = Math.max(dp[i][r], dp[i - 1][r]);
                int newRem = (r + rem) % 3;
                if (dp[i - 1][r] != Integer.MIN_VALUE) {
                    dp[i][newRem] = Math.max(dp[i][newRem], dp[i - 1][r] + num);
                }
            }
        }

        return dp[n][0];
    }
}
