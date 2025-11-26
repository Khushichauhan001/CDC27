package DP;

public class JumpGame2 {
    public int jump(int[] nums) {
        int n= nums.length ; 
        int jumps = 0;
        int l=0 , r=0 ;
        while(r<n-1){
            int farthest = 0 ;
            //find farthest
            for(int i = l ;i<=r ;i++){
             farthest = Math.max(farthest , i+nums[i]);

            }
            //new ranges 
            l=r+1;
            r = farthest ;
            jumps = jumps+1;
        }
        return jumps ;
    }
}
