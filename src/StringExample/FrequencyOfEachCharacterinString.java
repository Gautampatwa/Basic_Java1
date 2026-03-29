package StringExample;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyOfEachCharacterinString {
    public static void main(String[] args) {
        Scanner sr=new Scanner(System.in);
        String s= sr.nextLine();
        Map<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray())
        {
            if(map.containsKey(c))
            {
                map.put(c,map.getOrDefault(c,0)+1);
            }
            else {
                map.put(c,1);
            }
        }
        StringBuilder builder=new StringBuilder();
        for(var e:map.entrySet())
        {
            builder.append(e.getKey());
            builder.append(e.getValue());
        }
        System.out.println(builder);
        System.out.println(map);


    }
}
