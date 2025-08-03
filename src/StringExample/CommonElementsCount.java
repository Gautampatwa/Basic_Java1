package StringExample;

import java.util.HashMap;
import java.util.Map;

public class CommonElementsCount {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4};
        int[] arr2={1,3,4,5};
//        Output:3
        countCommon(arr1,arr2);
    }

    private static void countCommon(int[] arr1, int[] arr2) {
        int m=arr1.length;
        int n=arr2.length;
        Map<Integer,Integer> map1=new HashMap<>();
        Map<Integer,Integer> map2=new HashMap<>();
        for(int i:arr1)
        {
            map1.put(i,map1.getOrDefault(i,0)+1);
        }
        for(int j:arr2)
        {
            map2.put(j,map1.getOrDefault(j,0)+1);
        }
        int count=0;
        for(int i: map1.keySet())
        {
            if(map2.containsKey(i))
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
