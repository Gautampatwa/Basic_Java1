package StringExample;

import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        reverse(n);
    }

    private static void reverse(int n) {
        String value = Integer.toString(n);
        StringBuilder b = new StringBuilder();
        for (int i = value.length() - 1; i >= 0; i--) {
            b.append(value.charAt(i));
        }
        System.out.println(b);
    }
}
