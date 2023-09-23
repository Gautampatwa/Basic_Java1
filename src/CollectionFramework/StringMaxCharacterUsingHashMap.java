package CollectionFramework;

import java.util.HashMap;
import java.util.Scanner;

public class StringMaxCharacterUsingHashMap {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a String to find max occurrence:");
        String s=scanner.nextLine();

        HashMap<Character,Integer> map=new HashMap<>();
       StringBuilder builder=new StringBuilder();
        for(char c:s.toCharArray())
        {
            if(map.containsKey(c))
            {
                map.put(c,map.getOrDefault(c,0)+1);
            }
            else
            {
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
        System.out.println("Max character is :"+(char)key);

    }
}
