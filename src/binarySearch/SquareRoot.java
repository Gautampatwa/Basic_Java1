package binarySearch;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n to find square root:");
        int n=sc.nextInt();
        int sqrt = sqrt(n);
        System.out.println(sqrt);
    }
    public static int sqrt(int x) {
        if (x < 2) return x;
        int low = 1, high = x / 2, ans = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (mid <= x / mid) {
                ans = mid;
                low = mid + 1;
            } else high = mid - 1;
        }
        return ans;
    }
}
