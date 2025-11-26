package DP;

import java.util.Arrays;

public class LongestCommonSubse {
    int lcsut(String s1 , String s2 , int ind1, int ind2 , int[][] t){
        if(ind1<0 || ind2 <0){
            return 0;
        }
        if(t[ind1][ind2] != -1){
            return t[ind1][ind2];
        }
         if(s1.charAt(ind1) == s2.charAt(ind2)){
            return t[ind1][ind2] = 1+lcsut(s1,s2,ind1-1 , ind2-1, t);
         }
         else {
            return t[ind1][ind2] = Math.max(lcsut(s1,s2,ind1-1 , ind2 , t) , lcsut(s1,s2,ind1 , ind2-1,t ));
         }
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();

        int t[][] = new int[n][m];

        for(int rows[] : t){
            Arrays.fill(rows,-1);

        }
            return lcsut(text1,text2,n-1,m-1,t);
    }
}
