package FinexraInterviewPreparation;

import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many numbers you want in array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=n-1;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.print("===========================");
        int b[]=new int[n];
        int j=n;
        for(int i=0;i<n;i++)
        {
            b[j-1]=arr[i];
            j--;
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");

        }

    }
}
