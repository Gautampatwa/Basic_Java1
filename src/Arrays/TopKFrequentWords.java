package Arrays;

import java.util.*;

public class TopKFrequentWords {
    public static void main(String[] args) {
       String[] words={"i","love","leetcode","i","love","coding"};
       int k = 3;
        List<String> strings = topKFrequent(words, k);
        System.out.println(strings);
    }
            public static List<String> topKFrequent(String[] words, int k) {

                Map<String, Integer> map = new LinkedHashMap<>();
                for (String c : words) {
                    map.put(c, map.getOrDefault(c, 0) + 1);
                }

                List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
                list.sort((a, b) -> b.getValue() - a.getValue());

                List<String> result=new ArrayList<>();
                for (int i = 0; i < k; i++) {
                    result.add(list.get(i).getKey());
                }
                return result;

            }
}
