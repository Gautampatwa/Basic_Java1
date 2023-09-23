package FinexraInterviewPreparation;

public class Main {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "def";
        String str3 = "abcdef"; // Change this to your actual string

        boolean containsStr1AndStr2 = containsInOrder(str3, str1, str2);

        if (containsStr1AndStr2) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public static boolean containsInOrder(String str3, String str1, String str2) {
        int index1 = str3.indexOf(str1);
//        System.out.println(index1);
        if (index1 == -1) {
            return false; // str1 not found in str3
        }

        int index2 = str3.indexOf(str2);
//        System.out.println(index2);
        return index2 != -1;
    }
}
