package sorting;

import java.util.Scanner;

public class CountZeroFrom1ToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = scanner.nextInt();
        int zeroCount = 0;

        for (int i = 1; i <= n; i++) {
            String numStr = Integer.toString(i);
            for (char ch : numStr.toCharArray()) {
                if (ch == '0') {
                    zeroCount++;
                }
            }
        }

        System.out.println("Total count of zeros from 1 to " + n + " is: " + zeroCount);
    }
}
