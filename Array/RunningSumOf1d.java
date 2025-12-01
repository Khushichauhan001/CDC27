package Array;

public class RunningSumOf1d {
     public int[] runningSum(int[] nums) {
        int n = nums.length ;
        int[] ans = new int[n];
        int idx =0 ;
        int sum =0 ;
        for(int i=0 ;i< n ;i++){
            sum += nums[i];
            ans[idx++] = sum;
        }
        return ans;
    }
}
