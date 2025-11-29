package Recursion;
//gfg prblm 
import java.util.ArrayList;
import java.util.Arrays;

public class Subset {
     public ArrayList<ArrayList<Integer>> findSubsets(int[] arr) {
        // code here
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);
        helper(0 , arr , new ArrayList<>() , result );
        return result ;
    }
    private void helper(int idx, int[] arr , ArrayList<Integer> curr , ArrayList<ArrayList<Integer>> result){
        result.add(new ArrayList<>(curr));
        
        for(int i= idx ;i<arr.length ; i++){
            if(i> idx && arr[i] == arr[i-1]) continue ;
            
        curr.add(arr[i]);
        helper(i+1 , arr , curr, result);
        curr.remove(curr.size() -1 );
        }
    }
}
