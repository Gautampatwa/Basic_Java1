package sorting;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class InterSectionofTwoSortedArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int nums1[] = new int[n];
        int nums2[] = new int[m];
        for (int i = 0; i < n; i++) {
            nums1[i] = scanner.nextInt();
        }
        for (int j = 0; j < m; j++) {
            nums2[j] = scanner.nextInt();
        }
        intersection(nums1, nums2);
        //
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }

        for (int num : nums2) {
            if (set1.contains(num)) {
                set2.add(num);
            }
        }

        int[] result = new int[set2.size()];
        int index = 0;
        for (int num : set2) {
            result[index++] = num;
        }
        return result;
    }
}
