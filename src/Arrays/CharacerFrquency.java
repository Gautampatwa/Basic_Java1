package Arrays;

import java.util.*;

public class CharacerFrquency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                int count=map.get(c);
                map.put(c, ++count);
            } else {
                map.put(c, 1);
            }
        }
        List<String> list = new ArrayList<>();
        StringBuilder builder = new StringBuilder();
        for (var e : map.entrySet()) {
            builder.append(e.getKey()+" : "+e.getValue()+"   ");
            list.add(String.valueOf(e.getKey()));
            list.add(String.valueOf(e.getValue()));
        }
        System.out.println(builder);
    }
}
