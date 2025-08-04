package Recursion;

import java.util.Scanner;

public class multiplesofNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        multiples(n,k);
    }
    private static void multiples(int n, int k) {
        if(k==1)
        {
            System.out.println(n);
            return;
        }
        multiples(n,k-1);
        System.out.println(n*k);
    }
}
