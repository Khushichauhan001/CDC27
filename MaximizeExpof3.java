import java.util.Arrays;

public class MaximizeExpof3 {
     public int maximizeExpressionOfThree(int[] nums) {
        int n = nums.length ;
        int x=5 ;
        int max = Math.max(2,5);
        Arrays.sort(nums);
        int ans = nums[n-1]+nums[n-2]-nums[0];
        return ans ;
    }
}
