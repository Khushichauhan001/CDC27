package Stack;

import java.util.Stack;

public class PostFixEvaluater {
      public static int evaluatePostfix(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        for (String token : tokens) {
            if (token.matches("-?\\d+")) {
                st.push(Integer.parseInt(token));
            } else {
                int val1 = st.pop();
                int val2 = st.pop();
                switch (token) {
                    case "+":
                        st.push(val2 + val1);
                        break;
                    case "-":
                        st.push(val2 - val1);
                        break;
                    case "*":
                        st.push(val2 * val1);
                        break;
                    case "/":
                        st.push(val2 / val1);
                        break;
                    case "^":
                        st.push((int) Math.pow(val2, val1));
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown operator: " + token);
                }
            }
        }

        return st.pop();
    }

    public static void main(String[] args) {
        String[] arr = {"2", "3", "1", "*", "+", "9", "-"};
        System.out.println(evaluatePostfix(arr));  // Output: -4
    }
}
