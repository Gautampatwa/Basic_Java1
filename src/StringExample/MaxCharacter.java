package StringExample;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaxCharacter {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        char[] nums=s.toCharArray();

        Map<Character,Integer> map=new HashMap<>();
        for(char c:nums)
        {
            if(map.containsKey(c))
            {
                map.put(c, map.getOrDefault(c,0)+1);
            }
            else {
                map.put(c, map.getOrDefault(c,1));
            }
        }
        int max=0,fre=-1;
        for(var e:map.entrySet())
        {
            int value=e.getValue();
            if(value>max)
            {
                max=value;
                fre=e.getKey();
            }
        }
        System.out.println(max);
        System.out.println((char)fre);
    }
}
