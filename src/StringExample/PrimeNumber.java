package StringExample;

import java.util.Scanner;

public class PrimeNumber {
    int a=88;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int flag = 0;
        int m = n / 2;
        if (n == 0 || n == 1) {
            System.out.println("Not a prime");
        } else {
            for (int i = 2; i <= m; i++) {
                if (n % i == 0) {
                    flag = 1;
                    break;
                }
            }
        }
        if (flag != 1) {
            System.out.println("Prime Number:"+n);
        } else {
            System.out.println("Not prime");
        }
    }

}
