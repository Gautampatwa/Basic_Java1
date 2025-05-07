package StringExample;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IsomorphicStrign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        boolean isoMorphicYes = isoMorphic(s1, s2);
        System.out.println(isoMorphicYes);
    }

    private static boolean isoMorphic(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        Map<Character, Character> charMap = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            if (charMap.containsKey(c1)) {
                if (charMap.get(c1) != c2) {
                    return false;
                }
            } else {
                if (charMap.containsValue(c2)) {
                    return false;
                }
                charMap.put(c1, c2);
            }
        }
        return true;
    }
}
