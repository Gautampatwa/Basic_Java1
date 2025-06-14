package StringExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquarOfNumbers {

    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(-10,3,20,9,12,43);
        List<Integer> mixed= Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<Integer> list2 = list.stream().map(i -> i * i).collect(Collectors.toList());
        System.out.println(list2);
        List<Integer> even = mixed.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        List<Integer> odd = mixed.stream().filter(i -> i % 2 != 0).collect(Collectors.toList());
        List<Integer> segregate=new ArrayList<>();
        segregate.addAll(even);
        segregate.addAll(odd);
        System.out.println(segregate);
    }
}
