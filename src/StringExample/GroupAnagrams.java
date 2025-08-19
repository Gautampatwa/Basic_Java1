package StringExample;

import java.util.*;
import java.util.stream.Collectors;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(strs));
        System.out.println(usingJava8groupAnagrams(strs));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedKey = new String(charArray);
            if (!map.containsKey(sortedKey)) {
                map.put(sortedKey, new LinkedList<>());
            }
            map.get(sortedKey).add(str);
        }
        return new ArrayList<>(map.values());
    }

    public static List<List<String>> usingJava8groupAnagrams(String[] strs) {
        return Arrays.stream(strs)
                .collect(Collectors.groupingBy(s -> {
                    char[] chars = s.toCharArray();
                    Arrays.sort(chars);            // sorting chars makes the key
                    return new String(chars);
                }))
                .values()
                .stream()
                .collect(Collectors.toList());     // directly collect into List<List<String>>
    }
}
