package Array;

public class RemoveMinAndMax {
      public int minimumDeletions(int[] nums) {
        int n= nums.length ;
        int max = Integer.MIN_VALUE ;
        int min= Integer.MAX_VALUE ;
        int minIndex = 0;
        int maxIndex = 0;
        for(int i=0 ;i<n ;i++){
           if(nums[i] < min){
            min = nums[i];
            minIndex = i;
           } 
        }
        for(int i=0 ;i<n ;i++){
            if(nums[i] > max){
                max = nums[i];
                maxIndex =i ;
            }
        }

         int left = Math.min(minIndex, maxIndex);
        int right = Math.max(minIndex, maxIndex);
        int option1 = right + 1;
        int option2 = n - left;
        int option3 = (left + 1) + (n - right);
        
        return Math.min(option1, Math.min(option2, option3));
    }
}
