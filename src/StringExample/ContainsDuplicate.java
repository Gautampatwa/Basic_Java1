package StringExample;

import java.util.Arrays;
import java.util.Scanner;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int nums[] = {1, 5, 3, 4};
        boolean b = containsDuplicate(nums);
        if(b)
        {
            System.out.println("TRUE");
        }
        else {
            System.out.println("FALSE");
        }
    }

    private static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length - 1;
        for (int i = 0; i < n; ++i) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }
}