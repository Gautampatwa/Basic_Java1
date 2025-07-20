package Stack;


public class ArrayImplementationOfStack {
    public static class Stack {
        int[] arr = new int[5];
        int index = 0;

        void push(int x) {
            if (isFull()) {
                System.out.println("Stack is full");
                return;
            }
            arr[index] = x;
            index++;
        }

        int peek() {
            if (index == 0) {
                System.out.println("Stack is empty");
                return -1;
            }
            return arr[index - 1];
        }

        int pop() {
            if (index == 0) {
                System.out.println("Stack is empty");
                return -1;
            }
            int top = arr[index - 1];
            arr[index - 1] = 0;
            index--;
            return top;
        }

        void display() {
            for (int i = 0; i <= index - 1; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        int size() {
            return index;
        }

        boolean isEmpty() {
            return index == 0;
        }

        boolean isFull() {
            return index == arr.length;
        }

        int capacity() {
            return arr.length;
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(12);
        st.display();
        st.push(22);
        st.display();
        st.push(2);
        st.display();
        System.out.println(st.size());
        System.out.println(st.capacity());
    }
}
