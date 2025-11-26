package Array;
public class BinarySumOfSubarray {
     public int numSubarraysWithSum(int[] nums, int goal) {
        int a = helper(nums, goal);
        int b = helper(nums, goal - 1);
        return a - b;
    }

    private int helper(int[] nums, int goal) {
        if (goal < 0) return 0;
        int l = 0, r = 0, sum = 0, count = 0;

        while (r < nums.length) {
            sum += nums[r];
            while (sum > goal) {
                sum -= nums[l];
                l++;
            }
            count += (r - l + 1);
            r++;
        }
        return count;
    }
}
