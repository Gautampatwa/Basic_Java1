package Recursion;

import java.util.Scanner;

public class CheckingArraySortedOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = scanner.nextInt();
        }
        boolean b = checkSorted(arr, n);
        if(b)
        {
            System.out.println("Sorted");
        }
        else {
            System.out.println("Not Sorted");
        }
    }

    private static boolean checkSorted(int[] arr, int n) {

        if(n==0 || n==1)
            return true;

        if(arr[0]>arr[1]) {
            return false;
        }
        else {
            boolean b=checkSorted(arr,n-1);
            return b;
        }
    }
}
