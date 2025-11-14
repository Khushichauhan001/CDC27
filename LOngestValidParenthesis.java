import java.util.Stack;

public class LOngestValidParenthesis {
     public int longestValidParentheses(String s) {
       Stack<Integer> st = new Stack<>();
       st.push(-1);
    int maxLen =0;
    for(int i=0 ;i<s.length();i++){
        char ch = s.charAt(i);
        if( ch == '('){
            st.push(i);
        }
        else {
            st.pop();
         
            if(st.isEmpty()){
                st.push(i);
            }
            else{
                int len = i - st.peek();
                maxLen = Math.max(maxLen , len);
            }
        }
        
    }
        return maxLen ;
      
    }
}



//optimal 
// class Solution {
//     public int longestValidParentheses(String s) {
//         int left = 0, right = 0, maxLen = 0;

//         // Pass 1: Left -> Right
//         for (int i = 0; i < s.length(); i++) {
//             char ch = s.charAt(i);
//             if (ch == '(') left++;
//             else right++;

//             if (left == right) {
//                 maxLen = Math.max(maxLen, 2 * right);
//             } else if (right > left) {
//                 left = right = 0;
//             }
//         }

//         // Pass 2: Right -> Left
//         left = right = 0;
//         for (int i = s.length() - 1; i >= 0; i--) {
//             char ch = s.charAt(i);
//             if (ch == '(') left++;
//             else right++;

//             if (left == right) {
//                 maxLen = Math.max(maxLen, 2 * left);
//             } else if (left > right) {
//                 left = right = 0;
//             }
//         }

//         return maxLen;
//     }
// }
