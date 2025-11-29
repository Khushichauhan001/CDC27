package DP;

import java.util.Arrays;

public class RegularExpressionMatching {
   static boolean wildcardMatchUtil(String s, String p, int i, int j, int[][] dp){
       if(dp[i][j] != -1) return dp[i][j] == 1;

        if(j == 0) return i == 0;

        boolean ans = false;

        if(i > 0 && (p.charAt(j-1) == s.charAt(i-1) || p.charAt(j-1) == '.')){
            ans = wildcardMatchUtil(s, p, i-1, j-1, dp);
        }
        else if(j >= 2 && p.charAt(j-1) == '*'){
            ans = wildcardMatchUtil(s, p, i, j-2, dp);
            if(i>0 && (s.charAt(i-1) == p.charAt(j-2) || p.charAt(j-2) == '.')){
                ans = ans || wildcardMatchUtil(s, p, i-1, j, dp);
            }
        } 

        dp[i][j] = ans ? 1 : 0;
        return ans;
    }

    public boolean isMatch(String s, String p) {
        int n = s.length();
        int m = p.length();
        int[][] dp = new int[n+1][m+1];
        for(int[] row : dp) Arrays.fill(row, -1);
        return wildcardMatchUtil(s, p, n, m, dp);
    } 
}
