package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class sortNegativeAndPositive {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(-12, 34, -3, -38, 84, 7, 2, -23, 83);
        List<Integer> f=new ArrayList<>();
        List<Integer> negative = list.stream().filter(i -> i < 0).collect(Collectors.toList());
        List<Integer> positive = list.stream().filter(i -> i > 0).collect(Collectors.toList());
        f.addAll(negative);
        f.addAll(positive);
        System.out.println(f);

        System.out.println("Second Approach");
        int[] array = list.stream().mapToInt(Integer::intValue).toArray();
        int l=0,r=array.length-1;
        while(l<=r)
        {
            if(array[l]<0)
            {
                l++;
            }else if(array[r]>0)
            {
                r--;
            }
            else{
                int temp=array[l];
                array[l]=array[r];
                array[r]=temp;
                l++;
                r--;
            }
        }
        for(int i:array)
        {
            System.out.print(i+" ");
        }
    }
}

