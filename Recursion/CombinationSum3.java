package Recursion;
import java.util.ArrayList;
import java.util.List;

public class CombinationSum3 {
     List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        backtrack(1 , k , n , n , new ArrayList<>());
        return result ;
    }
    private void backtrack(int start , int k , int n , int required ,List<Integer>  temp){
        if(temp.size() == k){
           
            if(required == 0){
            result.add(new ArrayList<>(temp));
            }
            return ;
            
        }

        for(int i= start ;i<=9;i++){
                if(i>required) break ;
         temp.add(i);
        //  required -=i ;
         backtrack(i+1 , k , n, required-i, temp);
         temp.remove(temp.size() - 1);
        }

    }
}
