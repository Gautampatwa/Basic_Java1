package StringExample;

//Example 1:
//
//Input: word = "abcdefd", ch = "d"
//Output: "dcbaefd"
//Explanation: The first occurrence of "d" is at index 3.
//Reverse the part of word from 0 to 3 (inclusive), the resulting string is "dcbaefd".
//Example 2:
//
//Input: word = "xyxzxe", ch = "z"
//Output: "zxyxxe"
//Explanation: The first and only occurrence of "z" is at index 3.
//Reverse the part of word from 0 to 3 (inclusive), the resulting string is "zxyxxe".

import java.util.ArrayList;
import java.util.List;

public class ReversePrefixOfWord {
    public static void main(String[] args) {
      String word = "abcdefd";
      char ch = 'd';
        String s = reversePrefix(word, ch);
        System.out.println(s);
    }

    public static String reversePrefix(String word, char ch) {
        int index = -1;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ch) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            return word;
        }
        char[] chars=word.toCharArray();
        reverse(chars,0,index);
        return new String(chars);
    }

    private static void reverse(char[] word, int l, int r) {
        while (l < r) {
            char temp = word[l];
            word[l] = word[r];
            word[r] = temp;
            l++;
            r--;
        }
    }
}
