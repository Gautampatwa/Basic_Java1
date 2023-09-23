package StringExample;

import java.util.HashMap;
import java.util.Scanner;

public class MaxOccurenceofCharacter {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s= scanner.nextLine();
        char[] nums=s.toCharArray();
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:nums)
        {
            if(map.containsKey(c))
            {
                map.put(c,map.getOrDefault(c,0)+1);
            }
            else {
                map.put(c,map.getOrDefault(c,1));
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
        System.out.println((char)freq);
    }
}
