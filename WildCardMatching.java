import java.util.Arrays;

public class WildCardMatching {
    static int wildcardMatchUtil(String s , String p, int i , int j , int[][] dp){
        if(i<0 && j <0) return 1 ;
        if(j<0 && i>=0) return 0 ;
        if(i<0 && j>=0){
            for(int k=0 ;k<=j ;k++){
                if(p.charAt(k) != '*'){
                    return 0 ;
                }
            }
            return 1 ;
        }   

        if(dp[i][j] != -1 ) return dp[i][j];

        if(s.charAt(i) == p.charAt(j) || p.charAt(j) == '?'){
            return dp[i][j] = wildcardMatchUtil(s,p, i-1,j-1, dp);
        }
        else {
            if(p.charAt(j) == '*' ){
                return dp[i][j] = (wildcardMatchUtil(s,p,i-1 , j , dp) == 1 || wildcardMatchUtil(s,p,i, j-1,dp)==1) ? 1: 0;

            }
            else{
                return dp[i][j] = 0;
            }
        }
    }
    public boolean isMatch(String s, String p) {
    int n = s.length();
    int m = p.length();
    int[][] dp  = new int[n][m];
    for(int row[] : dp){
        Arrays.fill(row , -1 );
    }
    return wildcardMatchUtil(s , p , n-1 , m-1, dp)==1;    
    }
}
