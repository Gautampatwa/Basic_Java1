package CollectionFramework;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Enter from 1 to n number where in between prime number:" + a);
        boolean flag;
        for (int i = 2; i <= a; i++) {
            flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("Prime Numbers:"+i);
            }
        }

    }
}
