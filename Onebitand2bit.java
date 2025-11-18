public class Onebitand2bit {
    public boolean isOneBitCharacter(int[] bits) {
        int n = bits.length ;
         int count =0 ;
         for(int i=n-2 ;i>=0 ;i--){
            if(bits[i] == 1) count++;
            else break;
         }
         return count %2 == 0;
    }
}
