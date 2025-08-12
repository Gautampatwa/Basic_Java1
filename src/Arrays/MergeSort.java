package Arrays;

import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int n1=arr.length;
        divide(arr,0,n1-1);
        for(int num:arr)
        {
            System.out.print(num+" ");
        }
    }

    private static void divide(int[] arr, int m, int n) {
        if(m>=n)
        {
            return;
        }
        int mid=m+(n-m)/2;
        divide(arr,m,mid);
        divide(arr,mid+1,n);
        conquer(arr,m,mid,n);
    }

    private static void conquer(int[] arr, int m, int mid, int n) {
        int[] merged=new int[n-m+1];
        int index1=m;
        int index2=mid+1;
        int x=0;

        while(index1<=mid && index2<=n)
        {
            if(arr[index1]<=arr[index2])
            {
                merged[x++]=arr[index1++];
            }
            else {
                merged[x++]=arr[index2++];
            }
        }

        while (index1<=mid)
        {
            merged[x++]=arr[index1++];
        }

        while (index2<=n)
        {
            merged[x++]=arr[index2++];
        }
        for(int i=0,j=m;i<merged.length;i++,j++)
        {
            arr[j]=merged[i];
        }
    }
}
