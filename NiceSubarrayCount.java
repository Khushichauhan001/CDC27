import java.util.HashMap;
import java.util.Map;

public class NiceSubarrayCount {
     public int numberOfSubarrays(int[] nums, int k) {
        int count = 0;          
        int prefixSum = 0;      
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);        

        for (int num : nums) {
            if (num % 2 != 0) prefixSum++;
            if (map.containsKey(prefixSum - k)) {
                count += map.get(prefixSum - k);
            }
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }   
}
