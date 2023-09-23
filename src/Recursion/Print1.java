package Recursion;

import java.util.Scanner;

public class Print1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int fact=factorial(n);
        System.out.println(fact);
        int print = print(n);
        System.out.println(print);
    }

    private static int print(int n) {
        if(n==0 || n==1)
        {
            return 1;
        }
        int steps=print(n-1)+print(n-2);
        return steps;
    }

    private static int factorial(int n) {
        if(n==0 || n==1)
        {
            return 1;
        }
        return n*factorial(n-1);
    }
}
