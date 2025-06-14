package sorting;

import Access_Specifier.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TwoSumPairs {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        List<Integer> targetPair = findTargetPair(arr, t);
        System.out.println(targetPair);
    }

    private static List<Integer> findTargetPair(int[] arr, int t) {
        List<Integer> list = new ArrayList<>();
        int l = 0, r = arr.length - 1;
        while (l < r) {
            int sum = arr[l] + arr[r];
            if (sum == t) {
                list.add(l);
                list.add(r);
                return list;
            } else if (sum != t && l != r - 1) {
                r--;
            } else {
                l++;
                r = arr.length - 1;
            }
        }
        return list;
    }
}
