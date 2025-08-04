package Arrays;
import java.util.*;

public class TopKFrequents {
    public static void main(String[] args) {
        int[] nums = {3, 0, 1, 0};
        int k = 1;
        int[] ints = topKFrequent(nums, k);
        for(int i:ints)
        {
            System.out.print(i+" ");
        }

    }
            public static int[] topKFrequent(int[] nums, int k) {
                Map<Integer, Integer> freqMap = new HashMap<>();
                for (int num : nums) {
                    freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
                }
                List<Map.Entry<Integer, Integer>> sortedList = new ArrayList<>(freqMap.entrySet());
                sortedList.sort((a, b) -> b.getValue() - a.getValue());

                int[] result = new int[k];
                for (int i = 0; i < k; i++) {
                    result[i] = sortedList.get(i).getKey();
                }
                return result;
    }
}
