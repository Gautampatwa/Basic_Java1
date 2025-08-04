package Recursion;

import java.util.Scanner;

public class countDigitsinNumbers {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count = countDigits(n);
        System.out.println(count);
    }

    private static int countDigits(int n) {
    if(n>=0 && n<=9)
    {
        return 1;
    }
    return 1+countDigits(n/10);
    }
}