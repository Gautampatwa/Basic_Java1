package CollectionFramework;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetProgram1 {
    public static void main(String[] args) {
        String s = "aAAaeAaCcDdBb";
        String s1 = longestNiceSubstring(s);
        System.out.println(s1);
    }

    private static String longestNiceSubstring(String s) {
        Set<Character> set = new HashSet();
        for(char c : s.toCharArray()){
            set.add(c);
        }
//
        for(int i = 0; i < s.length(); i++){
            if(set.contains(Character.toUpperCase(s.charAt(i)))
                    && set.contains(Character.toLowerCase(s.charAt(i))))
                continue;

            String s1 = longestNiceSubstring(s.substring(0, i));
            String s2 = longestNiceSubstring(s.substring(i+1));
            return s1.length() >= s2.length() ? s1 : s2;
        }

        return s;
    }
}
