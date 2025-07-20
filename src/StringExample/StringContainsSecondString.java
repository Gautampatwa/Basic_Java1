package StringExample;

import java.util.HashSet;

public class StringContainsSecondString {
    public static void main(String[] args) {
        String s = "abcdefghijklmnop";
        String t = "bac";
        boolean stringContainsSecond = isStringContainsSecond(s, t);
        System.out.println(stringContainsSecond); // Output: false
    }

    private static boolean isStringContainsSecond(String s, String t) {
        HashSet<Character> sSet = new HashSet<>();
        for (char c : s.toCharArray()) {
            sSet.add(c);
        }

        for (char ch : t.toCharArray()) {
            if (!sSet.contains(ch)) {
                return false;
            }
        }
        return true;
    }
}
