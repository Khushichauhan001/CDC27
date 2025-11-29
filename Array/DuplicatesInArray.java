package Array;

import java.util.ArrayList;
import java.util.List;

public class DuplicatesInArray {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for(int n : nums){
            int idx = Math.abs(n)-1 ;

            if(nums[idx] <0){
                result.add(Math.abs(n));
            }
            else{
                nums[idx] = - nums[idx];
            }
        }
        return result ;
    }
}
