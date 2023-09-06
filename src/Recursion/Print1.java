package Recurssion;

import java.util.Scanner;

public class Print1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int fact=factorial(n);
        System.out.println(fact);
    }

    private static int factorial(int n) {
        if(n==0 || n==1)
        {
            return 1;
        }
        return n*factorial(n-1);
    }
}
