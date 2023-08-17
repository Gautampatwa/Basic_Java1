package Arrays;

import java.util.Scanner;

public class Fib {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter nth to find fibonacci:");
        int n = sc.nextInt();
        System.out.println("Fibonacci is:" + fib(n));
    }

    private static int fib(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            int f1 = fib(n - 1);
            int f2 = fib(n - 2);
            int c = f1 + f2;
            return c;
        }

    }
}
