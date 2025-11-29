package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagrams {
     public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s.length() < p.length()) return result;

        int[] need = new int[26];
        int[] window = new int[26];

        for (char c : p.toCharArray()) need[c - 'a']++;

        int left = 0, right = 0;
        int k = p.length();

        while (right < s.length()) {
            window[s.charAt(right) - 'a']++;

            if (right - left + 1 == k) {
                if (Arrays.equals(window, need)) result.add(left);
                window[s.charAt(left) - 'a']--;
                left++;
            }

            right++;
        }

        return result;
    }

    public static void main(String[] args) {
        String s1 = "cbaebabacd";
        String p1 = "abc";
        System.out.println("Output 1: " + findAnagrams(s1, p1));

        String s2 = "abab";
        String p2 = "ab";
        System.out.println("Output 2: " + findAnagrams(s2, p2));
    }
}
