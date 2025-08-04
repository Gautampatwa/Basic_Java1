package Recursion;

import java.util.Scanner;

public class SubstringRecursion {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s =sc.nextLine();
        printSubstrings(s, 0, 1);
    }

    static void printSubstrings(String s, int start, int end) {
        if (start == s.length()) {
            return;
        }

        if (end > s.length()) {
            printSubstrings(s, start + 1, start + 2);
        } else {
            System.out.println(s.substring(start, end));
            printSubstrings(s, start, end + 1);
        }
    }
}
