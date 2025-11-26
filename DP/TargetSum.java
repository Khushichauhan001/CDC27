package DP;

public class TargetSum {
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0 ;
        int n = nums.length ;
        // code here
        for(int i=0 ;i<n;i++ ){
            sum += nums[i];
        }
        
        if (sum < Math.abs(target) || (sum + target) % 2 != 0) return 0;

        int s1 = (target + sum)/2;
        // int s2 = sum - s1 ;
        
        return countOfSubset(nums, s1);
    }
    
    int countOfSubset(int[] nums , int target){
        int n = nums.length ;
        int[][] t = new int[n+1][target+1];
        
        for(int i=0 ; i<=n;i++){
            t[i][0]= 1;
        }
        
        for(int i=1 ; i<=n;i++){
            for(int j=0 ; j<=target ;j++){
                if(nums[i-1] <= j ){
                t[i][j] = t[i-1][j] + t[i-1][j-nums[i-1]];
                    
                }
                else {
                    t[i][j] = t[i-1][j];
                }
            }
        }
        return t[n][target];
    }
}
