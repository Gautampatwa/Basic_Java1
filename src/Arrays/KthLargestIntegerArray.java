package Arrays;

import java.util.PriorityQueue;

public class KthLargestIntegerArray {
    public static void main(String[] args) {
        String[] nums={"0","1","1"};
        int k=1;
        String s = kthLargestNumber(nums, k);
        System.out.println(s);
    }
        public static String kthLargestNumber(String[] nums, int k) {

            PriorityQueue<Double> pq = new PriorityQueue<>();
            for(int i=0;i<k;i++)
            {
                pq.add(Double.parseDouble(nums[i]));
            }
            for (int i=k;i<nums.length;i++) {
                if (pq.peek() < Double.parseDouble(nums[i])) {
                    pq.poll();
                    pq.add(Double.parseDouble(nums[i]));
                }
            }
          return String.valueOf(pq.peek().intValue());
    }
}
