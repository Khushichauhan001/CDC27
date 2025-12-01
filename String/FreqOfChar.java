package String;

import java.util.Arrays;

public class FreqOfChar {
     public static void printFrequency(String str) {
    char[] chars = str.toCharArray();

    // Sort the character array
    Arrays.sort(chars);

    char ch = chars[0]; // First character
    int count = 1;

    for (int i = 1; i < chars.length; i++) {
      if (chars[i] == ch)
        count++;
      else {
        System.out.print(ch + "" + count + " ");
        ch = chars[i];
       
        count = 1;
      }
}
     }
    }

