package FinexraInterviewPreparation;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {

            System.out.print("Enter the size of an array: Or / to exit: ");
            int m = scanner.nextInt();
            int[] arr = new int[m];
            if (m == '/') {
                break;
            }
            try {
                int n;
                n=m;
                System.out.println("Enter numbers");
                for (int i = 0; i < n - 1; i++) {
                    arr[i] = scanner.nextInt();
                }

                int totalSum = (n * (n + 1)) / 2;
                int sum = 0;
                for (int i = 0; i < n - 1; i++) {
                    sum += arr[i];
                }
                int missing = totalSum - sum;
                System.out.println("Missing Number:" + missing);
            } catch (InputMismatchException e) {
                System.out.println("Please enter valid number");
            }
        }
        System.out.println("Program Terminated,Thank you");
    }
}
