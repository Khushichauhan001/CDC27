import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;

public class MinDistBtw3 {
     public int minimumDistance(int[] nums) {
        int[] helper = nums ;
        HashMap<Integer, Deque<Integer>> map = new HashMap<>();
        int minDist = Integer.MAX_VALUE ;
        int x=0 ;
        int y=0 ;
        int[] arr2 = new int[nums.length];
        boolean found = false ;
        for(int i =0 ;i<helper.length ;i++){
            int val = helper[i];
            map.putIfAbsent(val, new ArrayDeque<>());
            Deque<Integer> indices = map.get(val);

            indices.addLast(i);
            if(indices.size() > 3) indices.removeFirst();
            if( x == 3) y++;

            if(indices.size() == 3){
                Integer[] arr = indices.toArray(new Integer[0]);
                if(y==0)x++;
                    int dist = 2 * (arr[2] - arr[0]);
                minDist = Math.min(minDist, dist);
                found = true ;
            }
        }
        return found ? minDist : -1 ;
    }
}
