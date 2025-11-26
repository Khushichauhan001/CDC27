public class MinOperation {
      public int minimumOperations(int[] nums) {
        int n= nums.length ;
        int count =0 ;
     for(int i=0;i<n ;i++){
        if(nums[i]%3 == 0){
            continue ;
        }
        else if(nums[i]%3 == 1 || nums[i]%3 == 2){
            count+= 1;
        }
     }
     return count;
    }
}
