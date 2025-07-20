package Stack;

import java.util.Stack;

public class PreviousGreaterElement {
    public static void main(String[] args) {
        int[] arr={100,80,60,70,60,75,85};
        //         -1 100 80 80 70 80 100
        int[] stockSpan = findstockSpan(arr);
        for(int i:stockSpan)
        {
            System.out.print(i+" ");
        }
    }

    private static int[] findstockSpan(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int n = arr.length;
        int[] res = new int[n];
        res[0] = -1;
        stack.push(arr[0]);
        for(int i=1;i<arr.length;i++)
        {
            while (stack.peek()<=arr[i] && !stack.isEmpty())
            {
                stack.pop();
            }
            if(stack.isEmpty()) {
                res[i] = -1;
            }
            else {
                res[i] = stack.peek();
            }
                stack.push(arr[i]);
        }
        return res;
    }
}
