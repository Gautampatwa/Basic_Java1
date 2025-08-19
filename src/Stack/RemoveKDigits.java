package Stack;

import java.util.Stack;

public class RemoveKDigits {
    public static void main(String[] args) {
        String num = "1432219";
        int k = 3;
        String result = removeKDigits(num, k);
        System.out.println("Smallest number: " + result);
    }

    private static String removeKDigits(String num, int k) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < num.length(); i++) {
            char c = num.charAt(i);
            while (!st.isEmpty() && k > 0 && st.peek() > c) {
                st.pop();
                k--;
            }
            st.push(c);
        }

        System.out.println(st);
        while (k > 0 && !st.isEmpty()) {
            st.pop();
            k--;
        }

        StringBuilder sb = new StringBuilder();
        for (char ch : st) {
            sb.append(ch);
        }

        while (sb.length() > 0 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }

        return sb.length() == 0 ? "0" : sb.toString();
    }
}
