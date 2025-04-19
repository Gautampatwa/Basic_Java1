package StringExample;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MergeSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read sizes of the arrays
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[] arr1 = new int[m];
        int[] arr2 = new int[n];

        // Read elements of arr1
        for (int i = 0; i < m; i++) {
            arr1[i] = sc.nextInt();
        }

        // Read elements of arr2
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        // Indices for traversing the arrays
        int i = m - 1;
        int j = n - 1;

        // List to store merged array in descending order
        List<Integer> list = new ArrayList<>();

        // Merge arrays
        while (i >= 0 && j >= 0) {
            if (arr1[i] > arr2[j]) {
                list.add(arr1[i]);
                i--;
            } else {
                list.add(arr2[j]);
                j--;
            }
        }

        // Add remaining elements from arr2
        while (j >= 0) {
            list.add(arr2[j]);
            j--;
        }
        while (i >= 0) {
            list.add(arr1[i]);
            i--;
        }
        System.out.println(list);
    }
}
