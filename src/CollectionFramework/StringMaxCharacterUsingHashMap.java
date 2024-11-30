package CollectionFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringMaxCharacterUsingHashMap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(("Enter a String to find Occurrence"));
        String s=sc.nextLine();
        StringBuilder builder=new StringBuilder();
        Map<Character,Integer> map=new HashMap<>();

        for(var c:s.toCharArray())
        {
            if(map.containsKey(c))
            {
                map.put(c,map.getOrDefault(c,0)+1);
            }
            else {
                map.put(c,1);
            }
        }
        int max=0;
        int key=0;
        for(var e:map.entrySet())
        {
            if(e.getValue()>max)
            {
                max=e.getValue();
                key=e.getKey();
            }
            builder.append(e.getKey());
            builder.append(e.getValue());
        }
        System.out.println(builder);
        System.out.println("Max char is:"+(char)key);
    }
}
