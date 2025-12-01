package BinarySearch;

import java.util.Arrays;

public class MaxRunTime {
    public long maxRunTime(int n, int[] batteries) {
        Arrays.sort(batteries);
        int m = batteries.length ;
        long total =0 ;
        for(int b :batteries) total+= b;
        long lo = 0 ;
        long hi = total /n ;
        while(lo < hi){
            long mid = (lo + hi + 1)/2;
            if(canRun(mid , n ,batteries)){
                lo=mid;
            }else{
                hi =mid-1;
            }
        }
        return lo ;
    }

    private boolean canRun(long T , int n , int[] batteries){
        long total=0 ;
        long need = T*(long) n ;
        for(int i= batteries.length -1 ; i>=0 ;i--){
           if(batteries[i]>= T){
            total+=T ;
           }
           else{
            total+= batteries[i];
           }
           if(total >= need) return true ;
        }
        return false;
    }
}
