import java.util.ArrayList;
import java.util.List;

public class Combinations {
     List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        backtrack(1 , n , k , new ArrayList<>());
        return result ;
    }
    private void backtrack(int start , int n , int k , List<Integer> temp){
        if(temp.size() == k){
            result.add(new ArrayList<Integer>(temp));
            return  ;
        }

        for(int i= start ; i<=n ;i++){
            temp.add(i);
            backtrack(i+1 , n ,  k ,  temp);
            temp.remove(temp.size() -1);
        }
    }
}
