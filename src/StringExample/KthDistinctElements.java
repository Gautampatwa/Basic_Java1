package StringExample;

import java.util.*;

public class KthDistinctElements {
    public static void main(String[] args) {
//        arr = ["d","b","c","b","c","a"], k = 2
//        Output: "a"
        String[] arr={"d","b","c","b","c","a"};
        int k=2;
        Map<String,Integer> map=new LinkedHashMap<>();
        for(String c:arr)
        {
            if(map.containsKey(c))
            {
                map.put(c,map.getOrDefault(c,0)+1);
            }
            else{
                map.put(c,1);
            }
        }
        List<String> list=new ArrayList<>();
        int count=0;
        for(var e:map.entrySet())
        {
            if(e.getValue()==1)
            {
                list.add(e.getKey());
            }
        }
        for(int i=0;i<k;i++)
        {
            if(i==k-1)
            {
                System.out.println(list.get(i));
            }
        }
    }
}
