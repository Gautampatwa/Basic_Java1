package Stack;

import java.util.Stack;

public class StackReverse {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(22);
        stack.push(33);
        stack.push(92);
        stack.push(12);
        int index=2;
        int x=9;
        System.out.println(stack);
        Stack<Integer> rt = new Stack<>();
        while (stack.size() > index) {
            rt.push(stack.pop());
        }
        stack.push(x);
        while (rt.size()>0)
        {
            stack.push(rt.pop());
        }
        System.out.println(stack);

    }
}
