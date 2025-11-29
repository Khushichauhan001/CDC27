package HashMap;

import java.util.HashMap;
import java.util.Map;

public class ZeroSumSubarray {
        public int findSubarray(int[] arr) {
     
       Map<Integer, Integer> map = new HashMap<>();
        int prefix = 0;
        int count = 0;

        map.put(0, 1);

        for (int x : arr) {
            prefix += x;

            if (map.containsKey(prefix)) {
                count += map.get(prefix);
            }

            map.put(prefix, map.getOrDefault(prefix, 0) + 1);
        }

        return count;
    }
}
