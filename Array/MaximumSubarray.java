package Array;

public class MaximumSubarray {
     public int maxSubArray(int[] nums) {
        int n= nums.length ;
        int sum = 0 ;
        int MaxiSum = Integer.MIN_VALUE ;
        for(int i= 0 ;i<n;i++){
            sum+=nums[i];
        if(sum > MaxiSum){
            MaxiSum  = sum ;
        }
        if(sum<0){
        sum =0 ;
        }
        }
        return MaxiSum ;
    }
}
