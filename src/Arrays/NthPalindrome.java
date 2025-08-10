package Arrays;

public class NthPalindrome {
    public static void main(String[] args) {
        int n =15;
        int nthPalindrome = findNthPalindrome(n);
        System.out.println(nthPalindrome);
    }

    private static int findNthPalindrome(int n) {
        int count = 0;
        int num = 1;
        while (true) {
            if (isPalindrome(num)) {
                count++;
                if (count == n) {
                    return num;
                }
            }
            num++;
        }
    }

    private static boolean isPalindrome(int num) {
        int original = num;
        int rev = 0;
        while (num> 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        return original == rev;
    }
}
