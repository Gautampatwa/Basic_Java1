package TwoPointers;

import java.util.Arrays;
import java.util.Scanner;

public class SegregateEvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int left=0, right=arr.length-1;
        while(left<right)
        {
           if(arr[left]%2==1 && arr[right]%2==0)
            {
                swap(arr,left,right);
                left++;
                right--;
            }
            if(arr[left]%2==0)
            {
                left++;
            }
            if(arr[right]%2!=0)
            {
                right--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int[] arr, int left, int right) {
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }
}
