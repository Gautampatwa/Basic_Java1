package Recursion;

import java.util.Scanner;

public class NthtoPower {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int pow = pow(n, k);
        System.out.println(pow);
    }

    private static int pow(int n, int k) {
        if(k==0)
            return 1;
        return n*pow(n,k-1);
    }
}
