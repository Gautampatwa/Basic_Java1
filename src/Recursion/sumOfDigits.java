package Recursion;

import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sumofDigits = sumOfDigitss(n);
        System.out.println(sumofDigits);
    }

    private static int sumOfDigitss(int n) {
        if(n>=0 && n<=9)
        {
            return n;
        }
        int prevsum=sumOfDigitss(n/10);
        int sum=prevsum+n%10;
        return sum;
    }
}
