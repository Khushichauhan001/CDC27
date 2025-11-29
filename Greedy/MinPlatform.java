package Greedy;

import java.util.Arrays;

public class MinPlatform {
    static int findPlatform(int arr[], int dep[]) {
        Arrays.sort(arr);
        Arrays.sort(dep);
        
        int i=1 ; 
        int j=0;
        int n = arr.length ;
        int count =1;
        int MaxCount =1 ;
        
        while(i<n && j<n){
            if(arr[i] <= dep[j]){
                count++;
                i++;
            }
            else{
                count--;
                j++;
            }
            MaxCount = Math.max(MaxCount, count);
        }
        return MaxCount ;
    }
}
