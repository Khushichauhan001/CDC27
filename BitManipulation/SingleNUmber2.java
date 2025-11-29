package BitManipulation;

import java.util.HashMap;
import java.util.Map;

public class SingleNUmber2 {
    public int singleNumber(int[] nums) {
        Map<Integer , Integer> m1 = new HashMap();
        for(int i : nums){
            m1.put(i , m1.getOrDefault(i , 0) + 1);
        }
        
        for(Map.Entry<Integer , Integer> entry : m1.entrySet()){
            if(entry.getValue() == 1){
                return entry.getKey();
            }
        }
        return -1 ;
    }
}
