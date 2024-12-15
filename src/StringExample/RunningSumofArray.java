package StringExample;

import java.util.Scanner;

public class RunningSumofArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scanner.nextInt();
        }
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
            System.out.print(sum+" ");
        }


    }
}
