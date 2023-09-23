package StringExample;


import java.util.HashMap;

public class WordPattern {
    public static void main(String[] args) {
        String pattern="abba";
        String s="dog cat cat dog";
        boolean b = wordPattern(pattern, s);
        System.out.println(b);
    }
    public static boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");

        if (pattern.length() != words.length) {
            return false;
        }

        HashMap<Character, String> charToWordMap = new HashMap<>();
        HashMap<String, Character> wordToCharMap = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];

            if (charToWordMap.containsKey(c)) {
                if (!charToWordMap.get(c).equals(word)) {
                    return false;
                }
            } else {
                charToWordMap.put(c, word);
            }

            if (wordToCharMap.containsKey(word)) {
                if (wordToCharMap.get(word) != c) {
                    return false;
                }
            } else {
                wordToCharMap.put(word, c);
            }
        }

        return true;
    }
}
