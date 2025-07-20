package StringExample;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MoveZeroToEnd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
                for(int i=0;i<arr.length;i++)
                {
                    arr[i]=sc.nextInt();
                }
                moveZeroes(arr);

    }

    private static void moveZeroes(int[] arr) {
        List<Integer> list=new ArrayList<>();
        List<Integer> finallist=new ArrayList<>();

        for(int i:arr)
        {
            list.add(i);
        }
       List<Integer> nonzeroes=list.stream().filter(i -> i != 0).collect(Collectors.toList());
        finallist.addAll(nonzeroes);
        int zeroesLength=list.size()-nonzeroes.size();
        for(int i=0;i<zeroesLength;i++)
        {
            finallist.add(0);
        }
        System.out.println(finallist);

    }
}
