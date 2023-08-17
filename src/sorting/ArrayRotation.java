package sorting;

import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size:");
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter how many positions you want to rotate:");
        int d = scanner.nextInt();
        arrayRotation(arr, d);
    }

    private static void arrayRotation(int[] arr, int d) {
        int m = arr.length;
        int temp[] = new int[m];
        int k = 0;
        for (int i = d; i < m; i++) {
            temp[k] = arr[i];
            k++;
        }

        for (int i = 0; i < d; i++) {
            temp[k] = arr[i];
            k++;
        }

        for (int i = 0; i < m; i++) {
            arr[i] = temp[i];
            System.out.print(arr[i]+" ");

        }

    }
}
