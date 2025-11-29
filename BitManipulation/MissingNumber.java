package BitManipulation;

public class MissingNumber {
     public int missingNumber(int[] nums) {
     int n = nums.length;
        int xor1 = 0; 
        int xor2 = 0  ;  
        for (int i = 0; i <= n; i++) {
            xor1 ^= i;
        } 

     for (int i = 0; i < nums.length; i++) {
          xor2 ^= nums[i];
            }
            
        return xor1 ^ xor2;
    }
}
