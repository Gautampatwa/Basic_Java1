package StringExample;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StringSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        MaxSubstring(s);
    }

    private static void MaxSubstring(String s) {
        int maxLength = 0;
        String substring = "";
        int start = 0;

        Set<Character> charSet = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (charSet.contains(ch)) {
                charSet.remove(s.charAt(start));
                start++;
            }

            charSet.add(ch);

            if (i - start + 1 > maxLength) {
                maxLength = i - start + 1;
                substring = s.substring(start, i + 1);
            }
        }

        System.out.println("Max Length: " + maxLength);
        System.out.println("Substring: " + substring);
    }
}
