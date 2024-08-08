package StringExample;

import java.util.*;

public class RemoveDuplicatesAndCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
         arr[i]= sc.nextInt();
        }
        List<Integer> list=new ArrayList<>();
        for(int a:arr)
        {
            if(!map.containsKey(a)) {
                list.add(a);
                map.put(a,1);
            }
        }
        System.out.println(list);
    }
}
