package StringExample;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountEachChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        charCount(s);
    }

    public static void charCount(String str) {
        Map<Character, Integer> mapCount = new HashMap<Character, Integer>();
        StringBuilder builder = new StringBuilder();
        char[] charArray = str.toCharArray();
        for (char c : charArray) {
            if(mapCount.containsKey(c)) {
                mapCount.put(c, mapCount.getOrDefault(c, 0) + 1);
            }
            else {
                mapCount.put(c,1);
            }
        }
        for (var e : mapCount.entrySet()) {
            builder.append(e.getKey());
            builder.append(e.getValue());
        }
        System.out.println(builder);
    }
}