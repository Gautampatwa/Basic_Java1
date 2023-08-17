package sorting;

import java.util.Scanner;

public class segregateEvenandOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size:");
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        seggregateEvenandOdd(arr, n);
    }

    private static void seggregateEvenandOdd(int[] arr, int n) {

        int j=-1;
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            {
                j++;

                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
