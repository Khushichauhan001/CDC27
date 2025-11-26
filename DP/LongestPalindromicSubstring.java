package DP;

public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        if(s.length() <= 1){
            return s ;
        }
        String LPS = "";

        for(int i=0 ; i<s.length() ; i++){
           int low = i ;
           int high = i ;
           while(low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high)){
             if (high - low + 1 > LPS.length()) {
                    LPS = s.substring(low, high + 1);
                }
                 low--;
            high++;
           }
        //    if(low == -1 || high == s.length()){
        //     break;
        //    }
        //    String palindrome = s.substring(low+1,high);
        //    if(palindrome.length()>LPS.length()){
        //     LPS =palindrome;
        //    }

           low=i;
           high = i+1;
            while (low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high)) {
                if ((high - low + 1) > LPS.length()) {
                    LPS = s.substring(low, high + 1);
                }
                low--;
                high++;
            }
         }

         return LPS ;
    }
}
