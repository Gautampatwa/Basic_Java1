package StringExample;

import java.util.Scanner;

public class FibUsingRec {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Please enter a number to find nth Fibonacci Number : (/ to exit): ");
            String input = scanner.nextLine();

            if (input.equals("/")) {
                break;
            }
            try {
                int n = fib(Integer.parseInt(input));
                System.out.println(n);
            } catch (NumberFormatException e) {
                System.out.println("Invalid number, Please enter correct number");
            }

        }
        System.out.println("Program terminated");
    }

    private static int fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            int fib1 = fib(n - 1);
            int fib2 = fib(n - 2);
            return fib1 + fib2;
        }
    }
}
