package Stack;

import java.util.Stack;

public class StockSpanProblem {
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
        for(int i=0;i<arr.length;i++)
        {
            while (!stack.isEmpty() && arr[stack.peek()]<=arr[i] )
            {
                stack.pop();
            }
            if(stack.isEmpty()) {
                res[i] = i;
            }
            else {
                res[i] =i-stack.peek();
            }
                stack.push(i);
        }
        return res;
    }
}
