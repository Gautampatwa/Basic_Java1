package Recursion;

import java.util.Scanner;

public class PrintNumbers {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printNumbers(n);
    }

    private static void printNumbers(int n) {
        if(n==1)
        {
            System.out.println(1);
            return;
        }
        printNumbers(n-1);
        System.out.println(n);
    }
}
