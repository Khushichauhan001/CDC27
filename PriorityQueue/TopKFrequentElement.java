package PriorityQueue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TopKFrequentElement {
     public int[] topKFrequent(int[] nums, int k) {
      HashMap<Integer, Integer> map = new HashMap<>();
      for(int i=0 ; i<nums.length ; i++){
        map.put(nums[i] , map.getOrDefault(nums[i] , 0)+1);
      }

      List<Integer>[] buckets = new List[nums.length +1];
      for(int key : map.keySet()){
        int freq = map.get(key);
        if(buckets[freq] == null){
            buckets[freq] = new ArrayList<>();
        }
            buckets[freq].add(key);
      }

    List<Integer> result = new ArrayList<>();
      for(int i= buckets.length -1 ; i>= 0 &&  result.size()< k ; i-- ){
          if(buckets[i] != null){
            result.addAll(buckets[i]);
          }
      }

      int[] ans = new int[k];
      for(int i=0 ; i<k ;i++){
        ans[i] = result.get(i);
      }

      return ans ;

    }
}
