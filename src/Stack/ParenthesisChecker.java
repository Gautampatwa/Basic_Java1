package Stack;
import java.util.Stack;

public class ParenthesisChecker {
    public static boolean areParenthesesBalanced(String expression) {
        Stack<Character> stack = new Stack<>();

        for (char ch : expression.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(') || (ch == ']' && top != '[') || (ch == '}' && top != '{')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String expression1 = "(()())";
        String expression2 = "[(a+b]*c)";

        System.out.println(expression1 + " Balanced: " + areParenthesesBalanced(expression1));
        System.out.println(expression2 + " Balanced: " + areParenthesesBalanced(expression2));
    }
}
