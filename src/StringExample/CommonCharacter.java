package StringExample;

import java.util.HashMap;
import java.util.Map;

public class CommonCharacter {

    public static void main(String[] args) {
        String str1 = "Saurabh";
        String str2 = "Gautamra";

        Map<Character, Integer> charCountMap1 = new HashMap<>();
        Map<Character, Integer> charCountMap2 = new HashMap<>();

        for (char c : str1.toCharArray()) {
            charCountMap1.put(c, charCountMap1.getOrDefault(c, 0) + 1);
        }

        for (char c : str2.toCharArray()) {
            charCountMap2.put(c, charCountMap2.getOrDefault(c, 0) + 1);
        }

        for (char c : charCountMap1.keySet()) {
            if (charCountMap2.containsKey(c)) {
                int occurrence = charCountMap1.get(c) + charCountMap2.get(c);
                System.out.println("Common character: " + c + ", Occurrence: " + occurrence);
            }
        }
    }
}
