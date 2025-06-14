package StringExample;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class MaxAverageUsingMap {
    public static void main(String[] args) {

        // Input as list of key-value pairs (simulate multiple values per key)
        List<   Map.Entry<String, Integer>> entries = List.of(
                Map.entry("Rohit", 12),
                Map.entry("Pankaj", 24),
                Map.entry("KL", 12),
                Map.entry("Rohit", 14),
                Map.entry("Pankaj", 12)
        );

        // Map to store total sum and count per key
        Map<String, List<Integer>> valueMap = new HashMap<>();

        for (var entry : entries) {
            valueMap.computeIfAbsent(entry.getKey(), k -> new ArrayList<>()).add(entry.getValue());
        }

        // Calculate averages and find max
        String maxKey = null;
        double maxAvg = Double.MIN_VALUE;
        System.out.println(valueMap);
        for (var e : valueMap.entrySet()) {
            double avg = e.getValue().stream().mapToInt(i -> i).average().orElse(0.0);
            if (avg > maxAvg) {
                maxAvg = avg;
                maxKey = e.getKey();
            }
        }

        System.out.println("Key with highest average: " + maxKey + " -> Average: " + maxAvg);
    }
}
