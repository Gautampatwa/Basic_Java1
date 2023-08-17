package sorting;

import java.util.Scanner;

public class Segregate0and1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size:");
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        seggregate(arr, n);
    }

    private static void seggregate(int[] arr, int n) {

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0)
                count++;
        }
        for (int i = 0; i < count; i++) {
            arr[i] = 0;
        }
        for (int i = count; i < n; i++) {
            arr[i] = 1;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
