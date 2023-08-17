package PracticeInterview;

import java.util.HashMap;

public class CommonCharacter {
    public static void main(String[] args) {
        String s1 = "Gautam";
        String s2 = "Mutaopml";

        HashMap<Character, Integer> hashMap1 = new HashMap<>();
        HashMap<Character, Integer> hashMap2 = new HashMap<>();

        for (char c : s1.toCharArray()) {
            hashMap1.put(c, hashMap1.getOrDefault(c, 0) + 1);
        }

        for (char c : s2.toCharArray()) {
            hashMap2.put(c, hashMap2.getOrDefault(c, 0) + 1);
        }


        for (char c : hashMap1.keySet()) {
            if (hashMap2.containsKey(c)) {
                int fre = hashMap1.get(c) + hashMap2.get(c);
                System.out.println(fre + ":" + c);
            }
        }
    }
}
