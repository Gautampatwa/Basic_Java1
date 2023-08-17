package FinexraInterviewPreparation;

import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n = scanner.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter numbers");
        for (int i = 0; i <= n - 2; i++) {
            arr[i] = scanner.nextInt();
        }

        int totalsum = (n * (n + 1)) / 2;
        int sum = 0;
        for (int i = 0; i <= n - 2; i++) {
            sum += arr[i];
        }
        int missing = totalsum - sum;
        System.out.println("Missing Number:" + missing);
    }
}
