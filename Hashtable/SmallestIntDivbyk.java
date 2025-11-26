package Hashtable;
public class SmallestIntDivbyk {
     public int smallestRepunitDivByK(int k) {

            int ans =0;
            int count =0;

          if(k % 2 == 0 || k% 5 ==0) return -1 ;
          for(int i=0 ;i<=k;i++){
            ans = (ans * 10 + 1) % k ;
            count+= 1;

            if(ans == 0) {
                return count ;
            }
        }
        return -1 ;
    }
}
