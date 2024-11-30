package StringExample;

import java.util.Scanner;

public class String2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("String is:" + s);
        String[] words = s.split(" ");
        for (var e : words) {
            System.out.println("Word is:" + e);
        }
        System.out.println("Reverse of words-");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.println("Reverse:" + words[i]);
        }
        System.out.println("============================");

        for (; ; ) {
            System.out.println("Welcome for loop");
        }

    }

}
