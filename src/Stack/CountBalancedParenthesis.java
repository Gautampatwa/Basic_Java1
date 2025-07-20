package Stack;

import java.util.Scanner;
import java.util.Stack;

public class CountBalancedParenthesis {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int isBalanced = isCountBalanced(s);
        System.out.println(isBalanced);
    }

    private static int isCountBalanced(String s) {
        Stack<Character> st = new Stack<>();
        int count = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                st.push(ch);
            } else {
                if (st.isEmpty()) {
                    count++;
                } else {
                    if (st.peek() == '(')
                        st.pop();
                }
            }
        }
        if(!st.isEmpty())
            return st.size();
        else return count;
    }
}
