package FinexraInterviewPreparation;

import java.util.Scanner;

public class SearchinArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n = scanner.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter numbers");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter element to search in array:");
        int target = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                System.out.println("Element Found:" + arr[i]);
            }
        }

    }
}
