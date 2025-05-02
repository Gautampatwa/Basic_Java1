package StringExample;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class FirstNonRepeatingChars {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        firstNonRepeating(s1);

    }
    private static void firstNonRepeating(String s1) {
        HashMap<Character,Integer> map=new LinkedHashMap<>();
        for(char c:s1.toCharArray())
        {
            if(map.containsKey(c))
            {
                map.put(c,map.getOrDefault(c,0)+1);
            }
            else {
                map.put(c,1);
            }
        }
        for(var e:map.entrySet())
        {
            if(e.getValue()==1)
            {
                System.out.println("First Non-Repeating:"+e.getKey());
                break;
            }
        }
    }
}
