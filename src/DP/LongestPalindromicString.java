package DP;

import java.util.Arrays;

public class LongestPalindromicString {
    public static StringBuilder[][] path;

    public static int longestCommonSubsequence(String text1, String text2, int[][] dp) {
        path = new StringBuilder[text1.length()][text2.length()];
        return rec(0, 0, text1, text2, dp);
    }

    private static int rec(int i, int j, String text1, String text2, int[][] dp) {
        if (i >= text1.length() || j >= text2.length()) {
            return 0;
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        if (text1.charAt(i) == text2.charAt(j)) {
            int len = 1 + rec(i + 1, j + 1, text1, text2, dp);
            dp[i][j] = len;
            path[i][j] = new StringBuilder();
            path[i][j].append(text1.charAt(i));
            if (i + 1 < text1.length() && j + 1 < text2.length() && path[i + 1][j + 1] != null) {
                path[i][j].append(path[i + 1][j + 1]);
            }
        } else {
            int move1 = rec(i + 1, j, text1, text2, dp);
            int move2 = rec(i, j + 1, text1, text2, dp);

            if (move1 > move2) {
                dp[i][j] = move1;
                path[i][j] = (i + 1 < text1.length() ? path[i + 1][j] : new StringBuilder());
            } else {
                dp[i][j] = move2;
                path[i][j] = (j + 1 < text2.length() ? path[i][j + 1] : new StringBuilder());
            }
        }

        return dp[i][j];
    }

    public static void main(String[] args) {
        String text1 = "abcdet";
        String text2 = "acet";

        int[][] dp = new int[text1.length()][text2.length()];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        int len = longestCommonSubsequence(text1, text2, dp);
        System.out.println("LCS Length: " + len);
        System.out.println("LCS String: " + path[0][0].toString());
    }

}
