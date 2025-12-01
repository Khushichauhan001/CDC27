package Array;

import java.util.Arrays;

 class RepeatingElement {
    public static void findRepeatingElements(int[] arr) {
        Arrays.sort(arr);  
        
        System.out.print("The repeating elements are: ");
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                System.out.print(arr[i] + " ");
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 4, 4, 5, 2};  // Example input
        findRepeatingElements(arr);  
    }
}
