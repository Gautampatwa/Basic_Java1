package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumberSumFromArrrayList {
    public static void main(String[] args) {
        List<Integer> ls= Arrays.asList(12,3,4,8,7,9,29,92);
        List<Integer> collect = ls.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(collect);
        int sum=0;
        for(int num:collect)
        {
            sum+=num;
        }
        System.out.println(sum);
    }
}
