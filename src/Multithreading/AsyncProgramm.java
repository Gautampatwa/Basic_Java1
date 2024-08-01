package Multithreading;

import java.util.Scanner;

public class AsyncProgramm {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        fun1(s);
        fun2(s);
        fun3(s);
    }


    public static void fun3(String s) {
        System.out.println("fun3");
    }

    public static void fun2(String s) {
        System.out.println("fun2");
    }

    public static void fun1(String s) {
        System.out.println("fun1");
    }
}
