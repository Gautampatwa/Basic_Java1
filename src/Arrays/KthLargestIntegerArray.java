package Arrays;

import java.util.PriorityQueue;

public class KthLargestIntegerArray {
    public static void main(String[] args) {
        String[] nums={"3","6","7","10"};
        int k=4;
        String s = kthLargestNumber(nums, k);
        System.out.println(s);
    }
        public static String kthLargestNumber(String[] nums, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            pq.add(Integer.parseInt(nums[i]));
        }
        for (int i = k; i < nums.length; i++) {
            if (pq.peek()<Integer.parseInt(nums[i])) {
                pq.poll();
            }
        }
        String s=String.valueOf(pq.peek());
        return s;
    }
}
