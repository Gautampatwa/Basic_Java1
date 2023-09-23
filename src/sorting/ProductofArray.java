package sorting;

import java.util.Scanner;

public class ProductofArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of Array:");
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int[] ints = prodcutOfArray(arr);
        for (int i : ints)
            System.out.print(i + " ");
    }

    private static int[] prodcutOfArray(int[] nums) {
        int n = nums.length;
        int left[] = new int[n];
        int right[] = new int[n];
        int[] res = new int[n];
        int prod = 1;

        for (int i = 0; i < n; i++) {
            left[i] = prod;
            prod = prod * nums[i];
        }

        prod = 1;
        for (int i = n - 1; i >= 0; i--) {
            right[i] = prod;
            prod = prod * nums[i];
        }

        for (int i = 0; i < n; i++) {
            res[i] = left[i] * right[i];
        }
        return res;
    }
}
