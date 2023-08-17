package Recursion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to find Factorial:");
        long n = sc.nextInt();
        System.out.println(fact(n));
    }

    public static long fact(long n) {
        if (n <= 1)
            return 1;
        else {
            long c = n * fact(n - 1);
            return c;
        }
    }

}
