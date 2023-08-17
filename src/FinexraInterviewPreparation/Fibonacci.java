package FinexraInterviewPreparation;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 1, d;
        System.out.println(a + " " + b);
        System.out.println("Enter how many Fibonacci you wants:");
        int c = scanner.nextInt();
        for (int i = 2; i < c; i++) {
            d = a + b;
            System.out.println(" " + d);
            a = b;
            b = d;
        }
    }
}
