package Recursion;

import java.util.Scanner;

public class sumOfNNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum = printSeriesSumAlternateSymbol(n);
        System.out.println(sum);
        int sum2 = printSeriesSum(n);
        System.out.println(sum2);
    }

    private static int printSeriesSum(int n) {
        if(n==0)
        {
            return 0;
        }
        return printSeriesSum(n-1)+n;
    }

    private static int printSeriesSumAlternateSymbol(int n) {

        if(n==0)
        {
            return 0;
        }
        if(n%2==0)
        {
            return printSeriesSumAlternateSymbol(n-1)-n;
        }
        else{
            return printSeriesSumAlternateSymbol(n-1)+n;
        }
    }
}
