package StringExample;

import java.util.Scanner;

public class StringWordReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=====================METHOD1====================");
        String s = scanner.nextLine();
        String[] words = s.split(" ");
        StringBuilder builder = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            builder.append(words[i]);

            if (i != 0) {
                builder.append(" ");
            }
        }
        System.out.println(builder.toString());
    }
}
