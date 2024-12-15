package StringExample;

import java.util.*;

public class RemoveDuplicatesinStringUsingHashMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        System.out.println("Enter string to remove duplicates:");
        char[] s = st.toCharArray();
        removeDuplicates(s);
    }

    private static void removeDuplicates(char[] s) {
        StringBuilder builder = new StringBuilder();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s) {
            if (!map.containsKey(c)) {
                builder.append(c);
                map.put(c, 1);
            }
        }
        System.out.println(builder);
    }
}
