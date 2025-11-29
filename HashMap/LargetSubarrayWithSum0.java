package HashMap;

import java.util.HashMap;
import java.util.Map;

public class LargetSubarrayWithSum0 {
    
    public static int maxLen(int[] arr, int n) {
        Map<Integer, Integer> map = new HashMap<>();
        int prefix = 0;
        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            prefix += arr[i];

            if (prefix == 0) {
                maxLen = i + 1;
            }

            if (map.containsKey(prefix)) {
                maxLen = Math.max(maxLen, i - map.get(prefix));
            } else {
                map.put(prefix, i);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {

        int[] arr1 = {15, -2, 2, -8, 1, 7, 10, 23};
        System.out.println(maxLen(arr1, arr1.length));
    }
}
