package sorting;

import java.util.Scanner;

public class ArrayPlusOne {
    public static void main(String[] args) {
        //arr=[1,2,3]   output=[124]
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size:");
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        for(int i=0;i<arr.length;i++) {
            if(arr[i]==arr.length)
            {
                arr[i]=arr[i]+1;
            }
            System.out.println(arr[i]);
        }
    }
}
