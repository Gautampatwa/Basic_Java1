package sorting;

import java.util.Scanner;

public class ArrayMaxAndMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size:");
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
       int maximum= max(arr);
        System.out.println("Maximum is:"+maximum);
    }

    public static int max(int[] arr) {
        int m=arr.length;
        int max=arr[0];
        for(int i=0;i<m;i++)
        {
            if(arr[i]>max);
            {
                max=arr[i];
            }
        }
        return max;
    }
}
