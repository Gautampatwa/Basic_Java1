package StringExample;

import java.util.HashSet;
import java.util.Scanner;

public class MaxSubstringWithOutNonRepeating {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println("Enter String to find Non-Repeating:" + s);
        subStringNonRepeating(s);
    }

    private static int subStringNonRepeating(String s) {
        if (s.length() == 0 || s == null) {
            return 0;
        }
        int l = 0, max = 0;
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            while (set.contains(s.charAt(i))) {
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(i));
            max = Math.max(max, i - l + 1);
        }
        String longestSubstring = s.substring(l, l + max);
        System.out.println("Longest Non-Repeating Substring: " + longestSubstring);
        System.out.println("Length: " + max);
        return max;
    }

}
