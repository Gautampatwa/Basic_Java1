package sorting;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n = scanner.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter numbers");
        for (int i = 0; i <= n - 1; i++) {
            arr[i] = scanner.nextInt();
        }
        int i = maxProfit(arr);
        System.out.println(i);
    }
    public static int maxProfit(int[] prices) {
        int max = 0;
        int delta = 0;
        for (int i = prices.length-1; i >= 0; i--) {
            if (prices[i] >= max) {
                max = prices[i];
            } else {
                delta = Math.max(max - prices[i], delta);
            }
        }
        return delta;
    }
}