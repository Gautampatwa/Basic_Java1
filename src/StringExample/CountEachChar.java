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
        StringBuilder builder=new StringBuilder();
        Map<Character,Integer> map=new HashMap<>();
        char[] arr=str.toCharArray();
        for(char c:arr)
        {
            if(map.containsKey(c))
            {
                map.put(c,map.getOrDefault(c,0)+1);
            }else {
                map.put(c,1);
            }
        }
        for(var e:map.entrySet())
        {
            builder.append(e.getKey());
            builder.append(e.getValue());
        }
        System.out.println(builder);
        System.out.println("===============================================");

    }
}