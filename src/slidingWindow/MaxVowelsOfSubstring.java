package slidingWindow;
//1456. Maximum Number of Vowels in a Substring of Given Length
// Given a string s and an integer k, return the maximum number of vowel letters
// in any substring of s with length k.
//
//Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'

//Input: s = "abciiidef", k = 3
//Output: 3
//Explanation: The substring "iii" contains 3 vowel letters
public class MaxVowelsOfSubstring {
    public static void main(String[] args) {
        String s = "abciiidef";
        int k = 3;
        int maxLength = findMaxLength(s, k);
        System.out.println("Max Substring of Vowel Length:"+maxLength);
    }

    private static int findMaxLength(String s, int k) {
        int max=0,count=0;
        for(int i=0;i<k;i++)
        {
            if(isVowel(s.charAt(i)))
            {
                count++;
            }
        }
        for(int i=k;i<s.length();i++)
        {

            if(isVowel(s.charAt(i)))
            {
                count++;
            }
            if(isVowel(s.charAt(i-k)))
            {
                count--;
            }
            max=Math.max(max,count);
        }
        return max;
    }

    private static boolean isVowel(char c) {
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
    }
}
