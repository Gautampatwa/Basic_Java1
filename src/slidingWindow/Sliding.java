package slidingWindow;

import java.util.Scanner;

public class Sliding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int sum = 13;
        sliding(arr, sum);
    }

    private static void sliding(int[] arr, int sum) {
        int l = 0;
        int r = arr.length - 1;
        // 1 3 4 8 9 11 16

        while (l < r) {
            if (arr[l] + arr[r] == sum) {
                System.out.println(l + " " + r);
                l++;
                r--;
            }else if (arr[l] + arr[r] > sum) {
                r--;
            } else {
                l++;
            }
        }
    }
}