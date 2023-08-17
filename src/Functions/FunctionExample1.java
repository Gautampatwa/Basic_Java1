package Functions;

import java.util.Scanner;

public class FunctionExample1 {

    public static void m2(String name) {
        System.out.println("m2 Method called:" + name);
    }

    public static int m1(int a, int b) {
        System.out.println("m1 method called");
        int c=a+b;
        System.out.println(c);
        return c;
    }

    public static void main(String[] args) {
//        FunctionExample1 functionExample1 =new FunctionExample1();
//        functionExample1.m1();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers:");
        int n = scanner.nextInt();
        if (n == 1) {
            m2("Gautam");
        } else {
            m1(10, 20);
        }
    }
}
