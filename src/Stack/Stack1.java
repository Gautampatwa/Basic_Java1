package Stack;

import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(22);
        stack.push(332);
        stack.push(393);
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.peek());

    }
}
