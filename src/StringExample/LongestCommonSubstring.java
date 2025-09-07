package StringExample;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LongestCommonSubstring {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        Arrays.sort(strs);
        int index=0;
        String s1=strs[0];
        String s2=strs[strs.length-1];
        while(index<s1.length() && index<s2.length())
        {
            if(s1.charAt(index)==s2.charAt(index))
            {
                index++;
            }
            else{
                break;
            }
        }
        System.out.println(s1.substring(0,index));
        System.out.println("Second Approach");
        Map<Character,Integer> map=new LinkedHashMap<>();
        for(String str:strs)
        {
            for(char c:str.toCharArray())
            {
                map.put(c,map.getOrDefault(c,0)+1);
            }
        }
        StringBuilder sb=new StringBuilder();
        for(var e:map.entrySet())
        {
            if(e.getValue()>1)
            {
                sb.append(e.getKey());
            }
        }
        System.out.println(sb.toString());

    }
}
