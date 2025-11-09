// import java.util.Arrays;

// public class HouseRobber1 {
//     public static int maxSum(int[] arr , int idx ,int[] dp ){
//         if(idx>= arr.length) return 0;
//         if(dp[idx] != -1) return dp[idx];
         
//         int pick = arr[idx] + maxSum(arr, idx+2, dp);
//         int notPick = maxSum(arr, idx+1, dp);

//         dp[idx] = Math.max(pick, notPick);
//         return dp[idx];
//     }
//     public static void main(String[] args) {
//         int[] arr = {5,2,1,7,6};
//         int n = arr.length ;
//         int[] dp = new int[n];
//         Arrays.fill(dp,-1);
        
//         int result = maxSum(arr, 0, dp);

//         System.out.println(result);
//     }
// }




//dp
public class HouseRobber1 {
    public static int maxSum(int[] arr ){
       int n = arr.length ;
       if(n==0) return 0;
       if(n==1) return arr[0];
       int[] dp = new int[n];
       dp[0] = arr[0];
       dp[1] =  Math.max(arr[0], arr[1]);

       for(int i=2 ;i<n;i++){
        dp[i] = Math.max(arr[i] + dp[i-2] , dp[i-1]);
       }
       return dp[n-1];
    }
    public static void main(String[] args) {
        int[] arr = {5,2,1,7,6};
        int result = maxSum(arr);

        System.out.println(result);
    }
}

