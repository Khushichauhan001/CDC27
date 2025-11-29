import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class WordBreak2 {
      static void helper(String s, HashSet<String> dictSet,
                       String curr, List<String> result, int start) {

        if (start == s.length()) {
            result.add(curr.trim());
            return;
        }

        for (int end = start + 1; end <= s.length(); end++) {
            String word = s.substring(start, end);

            if (dictSet.contains(word)) {  
                String newStr = curr + word + " ";
                helper(s, dictSet, newStr, result, end);
            }
        }
    }

    static String[] wordBreak(String[] dict, String s) {
        HashSet<String> dictSet = new HashSet<>();
        for (String w : dict) dictSet.add(w);
        List<String> result = new ArrayList<>();
        helper(s, dictSet, "", result, 0);
        return result.toArray(new String[0]);
    }

     public static void main(String[] args) {

        String[] dict = {"cat", "cats", "and", "sand", "dog"};
        String s = "catsanddog";

        String[] ans = wordBreak(dict, s);

        System.out.println("All possible sentences:");
        for (String sentence : ans) {
            System.out.println(sentence);
        }
    }
}
