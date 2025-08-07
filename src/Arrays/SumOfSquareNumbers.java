package Arrays;

import java.util.Scanner;

//Given a non-negative integer c, decide whether there're two integers
// a and b such that a2 + b2 = c.
//
//
//
//Example 1:
//
//Input: c = 5
//Output: true
//Explanation: 1 * 1 + 2 * 2 = 5
//Example 2:
//
//Input: c = 3
//Output: false
public class SumOfSquareNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=n/2;
        boolean isBoolean=false;
        for(int i=1;i<=m;i++)
        {
            int a=i;
            int b=i+1;
            int d=a*a+b*b;
            if (d == n) {
                isBoolean = true;
                break;
            }
        }
        System.out.println(isBoolean);
    }
}
