package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        permutation(nums,ans , new ArrayList<>(), used);
        return ans;
    }

    private void permutation(int[] nums, List<List<Integer>> ans , List<Integer> curr , boolean[] used ){
       if(curr.size() == nums.length){
        ans.add(new ArrayList<>(curr));
        return ;
       }

       for(int i=0 ; i< nums.length ; i++){
        if(!used[i]){
            used[i]= true ;
            curr.add(nums[i]);
            permutation(nums, ans , curr , used );
            curr.remove(curr.size() -1);
            used[i] = false ;
        }
       }

    }
}
