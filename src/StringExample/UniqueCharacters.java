package StringExample;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class UniqueCharacters {
    public static String uniqueChars(String input) {
        StringBuilder result = new StringBuilder();
        Map<Character, Integer> charMap = new HashMap<>();

        for (char c : input.toCharArray()) {
            if (!charMap.containsKey(c)) {
                result.append(c);
                charMap.put(c, 1);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String input = "aaaabbcccdd";
        String output = uniqueChars(input);
        System.out.println(output); // Output: "abcd"
        System.out.println("Using set");
        HashSet<Character> set = new HashSet<>();
        HashSet<Character> finalset = new HashSet<>();

        for (char c : input.toCharArray()) {
            if (!set.add(c)) {
                finalset.add(c);
            }
        }
        System.out.println(finalset.toString());
    }
}
