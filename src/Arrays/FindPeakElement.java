package Arrays;

import java.util.Scanner;

public class FindPeakElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        findPeak(arr);

    }

    private static void findPeak(int[] arr) {
        int peak = 0;
        for (int j = 0; j < arr.length-1; j++) {
            if (j > 0) {
                int a = arr[j - 1];
                int b = arr[j];
                int c = arr[j + 1];
                if (b > a && b > c) {
                    peak = b;
                }
            }
        }
        System.out.println(peak);

    }
}
