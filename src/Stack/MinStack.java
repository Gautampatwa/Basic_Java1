package Stack;

import java.util.Stack;

public class MinStack {

    Stack<Integer> st = new Stack<>();
    Stack<Integer> min = new Stack<>();

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(7);
        minStack.push(8);
        minStack.push(5);
        minStack.push(6);
        minStack.push(3);
        minStack.push(4);

        System.out.println("Current Min: " + minStack.getMin()); // Should print 3
        minStack.pop();
        minStack.pop();
        System.out.println("Top Element: " + minStack.top());    // Should print 3
        System.out.println("Current Min: " + minStack.getMin()); // Should still print 3
    }

    public void push(int val) {
        st.push(val);
        if (min.isEmpty() || val <= min.peek()) {
            min.push(val);
        } else {
            min.push(min.peek());
        }
    }

    public void pop() {
        if (!st.isEmpty()) {
            st.pop();
            min.pop();
        }
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        return min.peek();
    }
}
