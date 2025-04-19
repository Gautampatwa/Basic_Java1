package StringExample;


import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str =scanner.nextLine();
        str = str.toLowerCase();
        if (isPalindrome(str)) {
            System.out.print("Is a Palindrome");
        } else {
            System.out.print("Not a Palindrome");
        }
        System.out.println();
        System.out.println("==============================Second Approach if palindrome reverse it=====");
        isPalindrome1(str);
    }

    static boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static void isPalindrome1(String str) {
       String rev="";
       for(int i=str.length()-1;i>=0;i--)
       {
           rev+=str.charAt(i);
       }
       if(str.toLowerCase().equals(rev))
       {
           System.out.print("Is a Palindrome:"+rev);
       } else {
           System.out.print("Not a Palindrome:"+rev);
       }
    }
}
