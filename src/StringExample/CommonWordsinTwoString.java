package StringExample;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CommonWordsinTwoString {
    public static void main(String[] args) {

        String[] words1={"Hello", "this", "is","is","this", "Gautam"};
        String[] words2={"Hello", "this", "is", "Mukesh","Gautam"};
        Map<String, Integer> charCountMap1 = new HashMap<>();
        Map<String, Integer> charCountMap2 = new HashMap<>();
        for (String c :words1) {
            charCountMap1.put(c, charCountMap1.getOrDefault(c, 0) + 1);
        }
        for (String c : words2) {
            charCountMap2.put(c, charCountMap2.getOrDefault(c, 0) + 1);
        }
        int count=0;
        for(String s:words1)
        {
            if(charCountMap1.get(s)==1 && charCountMap2.getOrDefault(s,0)==1)
            {
                System.out.println(s);
                count++;
            }
        }
        System.out.println(count);
    }
}
