package FinexraInterviewPreparation;

import java.util.Scanner;

public class MissingNumberPractoce {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n-1;i++)
        {
            arr[i]=scanner.nextInt();
        }
        int totalsum=(n*(n+1))/2;
         int sum=0;
        for(int i=0;i<n-1;i++) {
        sum=sum+arr[i];
        }
        int miss=totalsum-sum;
        System.out.println(miss);
        }
}
