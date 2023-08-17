package FinexraInterviewPreparation;

import java.util.HashMap;
import java.util.Map;

public class CountEachChar {


    public static void charCount(String str) {
// String abc = str.toUpperCase();

        Map<Character, Integer> mapCount = new HashMap<Character, Integer>();

        char charArray[] = str.toCharArray();
        for (char c : charArray) {
            if (mapCount.containsKey(c)) {
                mapCount.put(c, mapCount.get(c) + 1);
            } else {
                mapCount.put(c, 1);
            }
        }
        System.out.println(mapCount);
    }

    public static void main(String[] args) {
        String test = "AnandKumarTripathi";
        CountEachChar.charCount(test);
    }

}