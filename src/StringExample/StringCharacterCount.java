package StringExample;

import java.util.Scanner;

public class StringCharacterCount {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter String");
        String str = scn.nextLine();
        System.out.println("Enter character to know its occurrence");
        char c = scn.nextLine().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == c) {
                count++;
            }
        }
        System.out.println("count is:" + count);
    }
}


