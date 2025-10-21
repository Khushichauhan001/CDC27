package String;

public class MaxFreqAfterOper {
     public int maxFrequency(int[] nums, int k, int numOperations) {
        int maxEl =0;
      for(int i =0; i<nums.length ;i++){
         maxEl = Math.max(maxEl , nums[i]);
      }
      maxEl += k;
      int[] freq = new int[maxEl + 1];
      for(int num : nums){
        freq[num]++;
      }

      for(int i=1 ; i<= maxEl ;i++){
        freq[i] += freq[i-1];
      }

        int result = 0 ;
       
        for (int target = 0; target <= maxEl; target++) {
            int targetCount = getFreq(freq, target) - getFreq(freq, target - 1);
            if (targetCount == 0) continue;

            int leftNum = Math.max(0, target - k);
            int rightNum = Math.min(maxEl, target + k);
            int totalCount = getFreq(freq, rightNum) - getFreq(freq, leftNum - 1);

            // int needConversion = totalCount - targetCount;

            // if (needConversion <= numOperations) {
            //     result = Math.max(result, totalCount);
            // } else {
            //     result = Math.max(result, targetCount + numOperations);
            // }
            int achievable = Math.min(totalCount, targetCount + numOperations);

            result = Math.max(result, achievable);
        }

        return result;
    }
    private int getFreq(int[] freq, int index) {
        if (index < 0) return 0;
        if (index >= freq.length) return freq[freq.length - 1];
        return freq[index];
    }
}
