package slidingWindow;

import java.util.Scanner;

public class MaxSumofSizeK {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int k=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        maxSumOfK(arr,k);
    }

    private static void maxSumOfK(int[] arr, int k) {
        int n=arr.length;
        int max;int sum=0;
        for(int i=0;i<k;i++)
        {
            sum+=arr[i];
        }
        max=sum;
        for(int i=k;i<n;i++)
        {
            sum=sum+arr[i]-arr[i-k];
            max=Math.max(max,sum);
        }
        System.out.println(max);
    }
}
