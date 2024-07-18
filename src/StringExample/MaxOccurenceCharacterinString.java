package StringExample;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaxOccurenceCharacterinString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        Map<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray())
        {
            if(map.containsKey(c))
            {
                map.put(c,map.getOrDefault(c,0)+1);
            }
            else{
                map.put(c,1);
            }
        }
        int max=0;
        int freq=-1;
        for(var e:map.entrySet())
        {
            if(e.getValue()>max)
            {
                max=e.getValue();
                freq=e.getKey();
            }
        }
        System.out.println((char)freq+":"+max);


    }
}
