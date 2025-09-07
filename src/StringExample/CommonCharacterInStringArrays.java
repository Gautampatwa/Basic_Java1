package StringExample;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CommonCharacterInStringArrays {

    public static void main(String[] args) {
        String[] words={"Satish","Sushil","Shanaya"};

        Set<Character> commonChars = new HashSet<>();
        for (char c : words[0].toCharArray()) {
            commonChars.add(c);
        }

        for (int i = 1; i < words.length; i++) {
            Set<Character> currentSet = new HashSet<>();
            for (char c : words[i].toCharArray()) {
                currentSet.add(c);
            }
            commonChars.retainAll(currentSet);
        }

        Character[] result = commonChars.toArray(new Character[0]);
        System.out.println(Arrays.toString(result));
    }
}
