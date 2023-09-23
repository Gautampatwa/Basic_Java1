package StringExample;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=====================METHOD1====================");
        String s = scanner.nextLine();
        String[] words=s.split(" ");
        StringBuilder stringBuilder = new StringBuilder(s);
        StringBuilder reverse = stringBuilder.reverse();
        System.out.println(reverse);
        System.out.println("=====================METHOD2====================");
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        System.out.println(rev);
        String rev1="";
        for (String word : words) {
            for (int i = word.length() - 1; i >= 0; i--) {
                rev1 = rev1 + word.charAt(i);

            }
        }
        System.out.print(rev1);

    }
}
