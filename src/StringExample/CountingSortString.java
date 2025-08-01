package StringExample;

public class CountingSortString {
    public static void main(String[] args) {
        String s = "abcdbcaf";
        String sorted = sortStringLinearTime(s);
        System.out.println("Sorted String: " + sorted);
    }

    private static String sortStringLinearTime(String s) {
        int[] freq = new int[26]; // for 'a' to 'z'

        // Count frequency of each character
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        // Build the sorted string
        StringBuilder sorted = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            while (freq[i]-- > 0) {
                sorted.append((char) (i + 'a'));
            }
        }

        return sorted.toString();
    }
}

