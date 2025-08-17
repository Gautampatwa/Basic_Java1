package StringExample;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(strs));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramGroups = new HashMap<>();
        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedKey = new String(charArray);
            if (!anagramGroups.containsKey(sortedKey)) {
                anagramGroups.put(sortedKey, new LinkedList<>());
            }
            anagramGroups.get(sortedKey).add(str);
        }
        return new ArrayList<>(anagramGroups.values());
    }
}
