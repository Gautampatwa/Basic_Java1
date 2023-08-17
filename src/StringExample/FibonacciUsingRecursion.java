package StringExample;

import java.util.Scanner;

public class FibonacciUsingRecursion {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter nth Fibonacci which you want:");
        int n=scanner.nextInt();
        int fi=fib(n);
        System.out.println(n+"th Fibonacci number:"+fi);
    }

    private static int fib(int n) {
        if(n==1)
        {
            return 0;
        }
        if(n==2)
        {
            return 1;
        }
        else {
            int fib1=fib(n-1);
            int fib2=fib(n-2);
            int c=fib1+fib2;
            return c;
        }
    }
}
