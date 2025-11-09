public class XsumOfallKSubarray {
     public int[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];
        int[] freq = new int[51];
        for (int i = 0; i < k; i++) {
            freq[nums[i]]++;
        }
        ans[0] = computeXSum(freq, k, x);
        for (int i = 1; i <= n - k; i++) {
            freq[nums[i - 1]]--;
            freq[nums[i + k - 1]]++;
            ans[i] = computeXSum(freq, k, x);
        }
        return ans;
    }

    private int computeXSum(int[] freq, int k, int x) {
        int distinct = 0;
        int totalSum = 0;
        for (int v = 1; v <= 50; v++) {
            if (freq[v] > 0) distinct++;
            totalSum += freq[v] * v;
        }
        if (distinct <= x) return totalSum;

        int remaining = x;
        int result = 0;
        for (int f = k; f >= 1 && remaining > 0; f--) {
            for (int val = 50; val >= 1 && remaining > 0; val--) {
                if (freq[val] == f) {
                    result += freq[val] * val;
                    remaining--;             
                }
            }
        }
        return result;
    }
}
