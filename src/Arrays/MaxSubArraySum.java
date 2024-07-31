package Arrays;

import java.util.Scanner;

public class MaxSubArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = sc.nextInt();
        }
        int maxSum = maxSubArraySum(arr);
        System.out.println(maxSum);

    }
    private static int maxSubArraySum(int[] arr) {
        int max = Integer.MIN_VALUE;
        int currentSum = 0;
        System.out.println(max);

        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];
            if (currentSum > max) {
                max = currentSum;
            }
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return max;
    }
}
