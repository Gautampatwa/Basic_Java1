package slidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PairSumEquals {
    public static List<List<Integer>> findPairsWithSum(int[] arr, int S) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(arr); // Sort the array

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == S) {
                List<Integer> pair = new ArrayList<>();
                pair.add(arr[left]);
                pair.add(arr[right]);
                result.add(pair);
                left++;
                right--;
            } else if (sum < S) {
                left++;
            } else {
                right--;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 6, 7, 8, 12};
        int S = 14;

        List<List<Integer>> pairs = findPairsWithSum(arr, S);

        for (List<Integer> pair : pairs) {
            System.out.println(pair);
        }
    }
}

