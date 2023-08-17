package StringExample;

import java.util.Scanner;

public class FactorialUsingRecursion {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int factorial=fact(n);
        System.out.println(factorial);
    }

    private static int fact(int n) {
        int f;
        if (n == 0 || n == 1) {
            return 1;
        } else {
            f = n * fact(n - 1);
            return f;
        }
    }
}
