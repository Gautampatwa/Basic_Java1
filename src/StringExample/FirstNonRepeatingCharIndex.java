package StringExample;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class FirstNonRepeatingCharIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        firstNonRepeating(s1);

    }

    private static void firstNonRepeating(String s1) {
        HashMap<Character, Integer> map = new LinkedHashMap<>();
        for (char c : s1.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            } else {
                map.put(c, 1);
            }
        }
        Character c=null;
        for (var e : map.entrySet()) {
            if (e.getValue() == 1) {
                c=e.getKey();
                break;
            }
        }
        if(c!=null)
        {
            for(int i=0;i<s1.length();i++)
            {
                if(s1.charAt(i)==c)
                {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
