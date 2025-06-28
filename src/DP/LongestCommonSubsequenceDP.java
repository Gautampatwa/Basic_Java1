package DP;

import java.util.Arrays;

public class LongestCommonSubsequenceDP {
    public static int longestCommonSubsequence(String text1, String text2, int[][] dp) {
        return rec(0, 0, text1, text2, dp);
    }

    private static int rec(int i, int j, String text1, String text2, int[][] dp) {
        if (i >= text1.length() || j >= text2.length()) {
            return 0;
        }
        if (dp[i][j] != -1)
            return dp[i][j];

        int ans = 0;
        if (text1.charAt(i) == text2.charAt(j)) {
            ans = rec(i + 1, j + 1, text1, text2, dp) + 1;
        } else {
            ans = Math.max(rec(i + 1, j, text1, text2, dp), rec(i, j + 1, text1, text2, dp));
        }
        return dp[i][j] = ans;
    }

    public static void main(String[] args) {
        String text1 = "abcdet";
        String text2 = "acet";

        // ✅ Initialize full 2D array and fill with -1
        int[][] dp = new int[text1.length()][text2.length()];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        System.out.println("Longest Common Subsequence: " + longestCommonSubsequence(text1, text2, dp));
    }
}
