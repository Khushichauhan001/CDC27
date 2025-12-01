package DP;


import java.util.Arrays;

public class HouseRobber2 {
    static int maxSumLinear(int[] arr, int index, int end, int[] dp) {
        if(index > end) return 0; 
        if(dp[index] != -1) return dp[index];
        int pick = arr[index] + maxSumLinear(arr, index + 2, end, dp);
        int notPick = maxSumLinear(arr, index + 1, end, dp);

        dp[index] = Math.max(pick, notPick);
        return dp[index];
    }
  static int maxSumCircular(int[] arr) {
        int n = arr.length;
        if(n == 1) return arr[0];
        int[] dp1 = new int[n];
        Arrays.fill(dp1, -1);
        int case1 = maxSumLinear(arr, 0, n-2, dp1);
        int[] dp2 = new int[n];
        Arrays.fill(dp2, -1);
        int case2 = maxSumLinear(arr, 1, n-1, dp2);

        return Math.max(case1, case2);
    }

    public static void main(String[] args) {
        int[] arr = {5, 1, 2, 6, 20, 2};
        System.out.println( maxSumCircular(arr));
    }
}
