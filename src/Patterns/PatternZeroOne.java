package Patterns;

import java.util.Scanner;

public class PatternZeroOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers:");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                int sum = i + j;
                if (sum % 2 == 0) {
                    System.out.print("1" + " ");
                } else {
                    System.out.print("0" + " ");
                }
            }
            System.out.println();
        }
        System.out.println("===============Number in Increasing Order pattern=====================");

        int m = scanner.nextInt();
        int number = 1;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
        System.out.println("======================HALF PYRAMID===========================");
        int s = scanner.nextInt();
        for (int i = 1; i <= s; i++) {
            for (int j = 1; j <= s - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1 + 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        System.out.println("Number in Decreasing Order");
        for(int i=1;i<=5;i++)
        {
            for(int j=5;j>=6-i;j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }


    }
}