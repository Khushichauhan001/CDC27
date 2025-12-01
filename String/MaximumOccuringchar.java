package String;

import java.util.Arrays;

public class MaximumOccuringchar {
    public char getMaxOccurringChar(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        int maxFreq = 1, currFreq = 1;
        char maxChar = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                currFreq++;
            } 
            else {
                if (currFreq > maxFreq) {
                    maxFreq = currFreq;
                    maxChar = arr[i - 1];
                }
                currFreq = 1;
            }
        }

        if (currFreq > maxFreq) {
            maxFreq = currFreq;
            maxChar = arr[arr.length - 1];
        }

        // Return result
        return maxChar;
    }
}
