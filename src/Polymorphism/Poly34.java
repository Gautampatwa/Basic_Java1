package Polymorphism;

public class Poly34 {
    public static void foo(int a, double b) {
        System.out.println("Method 1");
    }

    public static void foo(double a, int b) {
        System.out.println("Method 2");
    }

    public static void main(String[] args) {
        Poly34 poly34 = new Poly34();
        poly34.foo(5.0, 5);
    }

}
