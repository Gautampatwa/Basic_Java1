package Stack;

import java.util.Scanner;
import java.util.Stack;

public class nextGreaterElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size :");
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int[] ints = nextGreaterElementWhileStack(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(ints[i] + " ");
        }
    }

    private static int[] nextGreaterElementWhileStack(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int n = arr.length;
        int res[] = new int[n];
        res[n - 1] = -1;
        stack.push(arr[n - 1]);
        for (int i = n - 2; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() < arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                res[i] = -1;
            } else {
                res[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        return res;
    }
}
