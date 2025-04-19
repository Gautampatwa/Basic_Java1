package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class StringAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first string:");
        String s = sc.nextLine();

        System.out.println("Enter second string:");
        String s1 = sc.nextLine();

        boolean isAnagram = anagram(s, s1);

        System.out.println("Is it an anagram? " + isAnagram);
    }

    private static boolean anagram(String s, String s1) {
        char[] arr1 = s.toCharArray();
        char[] arr2 = s1.toCharArray();
        if (arr1.length != arr2.length) {
            return false;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }
}
