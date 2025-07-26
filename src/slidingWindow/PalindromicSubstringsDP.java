package slidingWindow;

import java.util.*;

public class PalindromicSubstringsDP {

    public static List<String> findPalindromicSubstrings(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        Set<String> result = new HashSet<>();
        String longest = "";
        for (int len = 1; len <= n; len++) {
            for (int i = 0; i <=n-len; i++) {
                int j = i + len - 1;
                if (s.charAt(i) == s.charAt(j)) {
                    if (len == 1 || len == 2 || dp[i + 1][j - 1]) {
                        dp[i][j] = true;
                        String sub = s.substring(i, j + 1);
                        result.add(sub);
                        if (sub.length() > longest.length()) {
                            longest = sub;
                        }
                    }
                }
            }
        }
        System.out.println("Longest Substring:" + longest);
        return new ArrayList<>(result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        List<String> palindromes = findPalindromicSubstrings(input);

        System.out.println("All unique palindromic substrings:");
        for (String p : palindromes) {
            System.out.println(p);
        }

        sc.close();
    }
}
