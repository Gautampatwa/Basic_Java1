package sorting;

import java.util.Scanner;

public class MissingNumberinSeries {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length-1;i++)
        {
            arr[i]=scanner.nextInt();
        }
        missingnumber(arr);
    }

    private static void missingnumber(int[] arr) {
        int n=arr.length;

        int totalsum=(n*(n+1))/2;
        int sum=0;
        for(int i=0;i<n-1;i++)
        {
            sum+=arr[i];
        }
        int missing=totalsum-sum;
        System.out.println(missing);

    }
}
