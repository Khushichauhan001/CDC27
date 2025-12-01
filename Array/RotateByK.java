package Array;

public class RotateByK {
     public void rotate(int[] nums, int k) {
       
          int n = nums.length; 
          k = k%n;

          if(n==1 || k == 0 ){
            return;
          }

          Reverse(nums , n-k , n-1);
          Reverse(nums , 0 , n-1-k);
          Reverse(nums , 0 , n-1);
        }

         public static void Reverse(int[] nums ,int start ,int end){
            while(start <= end){
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp ; 
                start++;
                end--;
            }
            }
        
}
