package Cursors;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=n/2;
        int flag=0;
        for(int i=2;i<=m;i++)
        {
            if(n%i==0)
            {
                flag=1;
            }
        }
        if(flag!=1)
        {
            System.out.println("Prime Number");
        }
        else {
            System.out.println("Not prime");
        }

        System.out.println("===================BUBBLE SORT=====================");
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
             a[i]=scanner.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]+" ");
        }
    }

}
