package Greedy;

public class CanPlaceFlower {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length ;
        for(int i=0 ;i<len;i++){
            if(flowerbed[i] == 0){
            int left = (i==0)? 0 : flowerbed[i-1];
            int right = (i== len-1) ? 0: flowerbed[i+1];
            if(left == 0 && right == 0){
                flowerbed[i] = 1 ;
                n--;

                if(n==0) return true ;  
            }
            }
           
        }
        return n <= 0;

    }
    public static void main(String[] args) {
        int[] arr ={ 1, 0,0,0,1};
        // int n = 2 ;// false
        int n = 1 ;
        System.out.println(canPlaceFlowers(arr, n));
    }
}
