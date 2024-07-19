package slidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.util.Arrays;

class Solution {
    public static int[] twoSum(int[] nums, int target) {
        // Create a copy of the original array and sort it
        int[] sortedNums = Arrays.copyOf(nums, nums.length);
        Arrays.sort(sortedNums);

        // Initialize pointers
        int left = 0;
        int right = sortedNums.length - 1;

        while (left < right) {
            int sum = sortedNums[left] + sortedNums[right];
            if (sum == target) {
                return findIndices(nums, sortedNums[left], sortedNums[right]);
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        throw new IllegalArgumentException("No two sum solution");
    }

    // Helper method to find indices in the original array
    private static int[] findIndices(int[] nums, int num1, int num2) {
        int[] indices = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == num1) {
                indices[0] = i;
                break;
            }
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == num2) {
                indices[1] = i;
                break;
            }
        }
        return indices;
    }

    public static void main(String[] args) {
        int[] arr = {1, 6, 7, 8, 12};
        int S = 14;

        int[] pairs = twoSum(arr, S);

        for (int pair : pairs) {
            System.out.print(pair+" ");
        }
    }
}

