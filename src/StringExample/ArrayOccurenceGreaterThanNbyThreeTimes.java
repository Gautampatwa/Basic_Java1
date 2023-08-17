package StringExample;

import java.util.HashMap;

public class ArrayOccurenceGreaterThanNbyThreeTimes {
    public static void maxOccurence(int nums[]) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (hashMap.containsKey(nums[i])) {
                hashMap.put(nums[i], hashMap.get(nums[i]) + 1);
            } else {
                hashMap.put(nums[i], 1);
            }
        }
        System.out.println(hashMap);
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 2, 1, 5, 4, 6, 1, 9, 8, 2, 2, 1, 2, 3, 9, 1};
        maxOccurence(nums);
    }
}
