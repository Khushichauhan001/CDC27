package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {
     public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        List<Integer> ds = new ArrayList<>();
        combination(0 , candidates , target , result,new ArrayList<>());
        return result;
    }
    private void combination(int idx , int[] arr , int target , List<List<Integer>> result , List<Integer> ds){
            
            if(target == 0){
              result.add(new ArrayList<>(ds));
                return ;
        }

        for (int i = idx; i < arr.length; i++) {
            if (i > idx && arr[i] == arr[i - 1]) continue;
            if (arr[i] > target) break;
             
        ds.add(arr[i]);
        // sum += arr[idx];

        combination(i+1 , arr , target-arr[i] , result , ds);
        ds.remove(ds.size() -1);
        }
    }
        // sum -= arr[idx];
}
