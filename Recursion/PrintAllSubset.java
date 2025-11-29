package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintAllSubset {
     public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
       backTrack(nums, 0 , new ArrayList<>(), result);
       return result ;

    }
    private void backTrack(int[] nums , int idx , List<Integer> current , List<List<Integer>> result  ){
        if(idx == nums.length ){
            result.add(new ArrayList<>(current));
            return ;
        }

          current.add(nums[idx]);
          backTrack(nums, idx+1, current , result );

          current.remove(current.size() -1 );
          backTrack(nums, idx+1 , current , result);
    }
}
