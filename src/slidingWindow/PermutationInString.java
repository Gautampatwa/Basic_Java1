package slidingWindow;

public class PermutationInString {
    public static boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        int[] s1Freq = new int[26];
        int[] s2Freq = new int[26];

        // Count frequency of s1
        for (char c : s1.toCharArray()) {
            s1Freq[c - 'a']++;
        }

        // Initialize the first window in s2
        for (int i = 0; i < s1.length(); i++) {
            s2Freq[s2.charAt(i) - 'a']++;
        }

        // Slide the window across s2
        for (int i = s1.length(); i < s2.length(); i++) {
            if (matches(s1Freq, s2Freq)) return true;

            // Remove the leftmost character of previous window
            s2Freq[s2.charAt(i - s1.length()) - 'a']--;
            // Add the new character
            s2Freq[s2.charAt(i) - 'a']++;
        }

        // Final check for the last window
        return matches(s1Freq, s2Freq);
    }

    private static boolean matches(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "ab", s2 = "eidbaooo";
        System.out.println(checkInclusion(s1, s2));  // Output: true
    }
}
