package Recursion;

import Access_Specifier.A;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MoveZeroesToRight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] arr1 = moveZeroes(arr);
        for (int e : arr1) {
            System.out.print(e + " ");
        }
    }

    private static int[] moveZeroes(int[] arr) {
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[c] = arr[i];
                c++;
            }
        }
        while (c < arr.length) {
            arr[c]=0;
            c++;
        }
        return arr;
    }
}
