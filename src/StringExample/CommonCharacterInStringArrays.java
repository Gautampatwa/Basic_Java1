package StringExample;

import java.util.*;

public class CommonCharacterInStringArrays {

    public static void main(String[] args) {
        String[] words={"bella","label","roller"};
        int[] minFreq = new int[26];
        Arrays.fill(minFreq, Integer.MAX_VALUE);

        for (String word : words) {
            int[] freq = new int[26];
            for (char c : word.toCharArray()) {
                freq[c - 'a']++;
            }

            for (int i = 0; i < 26; i++) {
                minFreq[i] = Math.min(minFreq[i], freq[i]);
            }
        }

        List<String> result = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < minFreq[i]; j++) {
                result.add(String.valueOf((char) (i + 'a')));
            }
        }
        System.out.println(result);
    }
}
