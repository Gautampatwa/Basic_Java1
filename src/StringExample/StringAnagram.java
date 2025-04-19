package StringExample;

import java.util.Arrays;
import java.util.Scanner;

public class StringAnagram {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter First String:");
        String s1=scanner.nextLine();
        System.out.println("Enter Second String:");
        String s2=scanner.nextLine();
        boolean anagram = anagram(s1, s2);
        System.out.println(anagram);
    }

    private static boolean anagram(String s1, String s2) {
        char[] arr1=s1.toCharArray();
        char[] arr2=s2.toCharArray();
        int m=arr1.length;
        int n=arr2.length;

        if(m!=n)
        {
            return false;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
       return Arrays.equals(arr1,arr2);
    }
}
