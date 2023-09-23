package StringExample;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public static void main(String[] args) {
        String s = "egg";
        String s1 = "add";
        boolean isomorphic = isIsomorphic(s, s1);
        System.out.println(isomorphic);
    }

    public static boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Character> charMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char char1 = s.charAt(i);
            char char2 = t.charAt(i);

            if (charMap.containsKey(char1)) {
                if (charMap.get(char1) != char2) {
                    return false;
                }
            } else {
                if (charMap.containsValue(char2)) {
                    return false;
                }
                charMap.put(char1, char2);
            }
        }

        return true;
    }
}