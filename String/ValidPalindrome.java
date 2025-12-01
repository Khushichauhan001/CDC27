package String;

public class ValidPalindrome {
     public static boolean isPalindrome(String s) {
        
          if(s.isEmpty()){
            return true ;
          }
          int start = 0 ;
          int last = s.length()-1;
          while(start <= last) {
            char l = s.charAt(start) , r = s.charAt(last);
            if(!Character.isLetterOrDigit(l)){
            start++;
            } else if (!Character.isLetterOrDigit(r)){
            last--;
            }else{
                if(Character.toLowerCase(l)!= Character.toLowerCase(r)){
            return false;
            }
                start++ ;
                last--;
            }
          }
          return true ;
    }
    public static void main(){
        String str = "ABCDCBA";
        boolean ans = isPalindrome(str);

        if(ans == true){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
}
