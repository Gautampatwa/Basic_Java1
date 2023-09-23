package sorting;

import java.util.Scanner;

public class ArrayRightRotation {
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
        arrayRightRotation(arr, d);
    }

    private static void arrayRightRotation(int[] arr, int d) {
        int m = arr.length;
        d = d%m;
        for(int i=0;i<m;i++)
        {
            if(i<d)
            {
                System.out.print(arr[m+i-d]+" ");
            }
            else {
                System.out.print(arr[i-d]+" ");
            }
        }
    }
}
//