package Arrays;

import java.util.*;

public class LongestConsecutive {
    public static void main(String[] args) {
     int[]  nums = {100,4,200,1,3,2};
        int c = longestConsecutive(nums);
        System.out.println(c);
    }

    public static int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        Set<Integer> store = new HashSet<>();
        for (int num : nums) {
            store.add(num);
        }
        List<Integer> list = new ArrayList<>(store);
        Collections.sort(list);

        int longest = 1;
        if (list.isEmpty()) {
            return 0;
        }

        int currentCount = 1;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) == list.get(i - 1) + 1) {
                currentCount++;
            } else if (list.get(i) != list.get(i - 1)) {
                longest = Math.max(longest, currentCount);
                currentCount = 1;
            }
        }
        longest = Math.max(longest, currentCount); // Check for the last sequence
        return longest;
    }
}
