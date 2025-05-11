package StringExample;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumbersbInBetween {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        List<Integer> integers = getPrimesInRange(m, n);
        System.out.println(integers);

    }

    private static List<Integer> getPrimesInRange(int m, int n) {
        List<Integer> primeList = new ArrayList<>();
        for (int i = m; i <= n; i++) {
            if (isPrime(i)) {
                primeList.add(i);
            }
        }
        return primeList;
    }

    private static boolean isPrime(int n) {
        int flag = 0;
        int m = n / 2;
        if (n == 0 || n == 1) {
            return true;
        } else {
            for (int i = 2; i <= m; i++) {
                if (n % i == 0) {
                    flag = 1;
                    break;
                }
            }
        }
        return flag != 1;
    }
}
