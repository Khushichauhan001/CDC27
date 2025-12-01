package Sorting;

public class SelectionSort {
    static void select_sort(int arr[] , int n){
        for(int i=0 ; i<n ; i++){
            int min = i ;
            for(int j = i+1 ; j<n ; j++){
                if(arr[j] < arr[min])
                 min = j;
           }
        int temp = arr[min];
        arr[min] =  arr[i];
        arr[i] = temp ; 
      }

      System.out.println("After selection sort: ");
      for(int i= 0 ; i< n ; i++){
         System.out.print(arr[i] + " ");
      }
      System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 13, 21, 6 , 17 , 95, 45, 65 , 98};
        int n = arr.length;
        System.out.println("Before selection sort");
        for(int i = 0 ; i< n ;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        select_sort(arr, n);
    }
}
