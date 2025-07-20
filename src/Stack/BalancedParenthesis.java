package Stack;

import java.util.Scanner;
import java.util.Stack;

public class BalancedParenthesis {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean isBalanced = isBalanced(s);
        System.out.println(isBalanced);
    }

    private static boolean isBalanced(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                st.push(ch);
            } else {
                if (st.isEmpty())
                    return false;
                if (st.peek() == '(')
                    st.pop();
            }
        }
        return st.isEmpty();
    }
}
