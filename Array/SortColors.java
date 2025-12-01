package Array;

public class SortColors {
     public int sortColors(int[] arr) {
        int n= arr.length;
        int low = 0;
        int mid = 0 ;
        int high = n-1;
        while(mid <= high){
            if(arr[mid] == 0){
              int temp = arr[low];
              arr[low] = arr[mid];
              arr[mid] = temp ;
              mid++;
              low++;
            }
            else if(arr[mid] == 1){
               mid++;
            }
            else {
              int temp = arr[mid];
              arr[mid] = arr[high];
              arr[high] = temp;
              high--;
            }
        }
        return  0;
    }
}
