package StringExample;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        removeDuplicates(arr);
    }

    private static void removeDuplicates(int[] arr) {
        List<Integer> list=new ArrayList<>();
        Map<Integer,Integer> map=new HashMap<>();

        for(int n:arr)
        {
            if(!map.containsKey(n))
            {
                list.add(n);
                map.put(n,1);
            }
        }
        System.out.println(list);

    }
}
