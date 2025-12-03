// package Greedy;

public class MaxChunks {
    public int maxChunksToSorted(int[] arr) {
        int chunks =0 ;
        int maxSoFar = Integer.MIN_VALUE ;
        for(int i=0 ;i<arr.length ;i++){
            maxSoFar = Math.max(maxSoFar , arr[i]);
            if(maxSoFar == i) chunks++;

        }
        return chunks ;
    }
    
}
