package DP;

//647. Palindromic Substrings
//Given a string s, return the number of palindromic substrings in it.
//A string is a palindrome when it reads the same backward as forward.
//A substring is a contiguous sequence of characters within the string.

//Input: s = "abc"
//Output: 3
//Explanation: Three palindromic strings: "a", "b", "c".
public class PalidromicPartioning {
    public static void main(String[] args) {
       String s="abc";
        int count = countSubstrings(s);
        System.out.println(count);
    }

    public static int countSubstrings(String s) {

        int n=s.length();
        int[][] dp =new int[n][n];
        for(int gap=1;gap<n;gap++)
        {
            for(int row=0,col=gap;row<n-gap;row++,col++)
            {
              if(isPalindrome(s,row,col))
              {
               dp[row][col]=0;
              }
              else{
                  dp[row][col]=Integer.MAX_VALUE;
                for(int k=row;k<col;k++)
                  {
                      dp[row][col]=Math.min(dp[row][col],1+dp[row][k]+dp[k+1][col]);
                  }
              }
            }
        }
        return dp[0][n-1];
    }

    private static boolean isPalindrome(String s, int row, int col) {
        while(row<col) {
            if (s.charAt(row++) != s.charAt(col--))
                return false;
        }
        return true;
    }
}
