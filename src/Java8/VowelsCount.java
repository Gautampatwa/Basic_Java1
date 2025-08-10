package Java8;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class VowelsCount {
    public static void main(String[] args) {
        String s = "Virrutusa";
        s = s.toLowerCase();
        long count = s.chars().filter(i -> "aeiou".indexOf(i) != -1).count();
        System.out.println(count);
        System.out.println("Each char count");
        Map<Character, Long> collect = s.chars().mapToObj(c -> (char) c).
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        collect.entrySet().stream().filter(e -> e.getValue() > 1).forEach(System.out::println);
        List<Map.Entry<Character, Long>> collect1 = collect.entrySet().stream().
                filter(e -> e.getKey() == 'r').collect(Collectors.toList());
        System.out.println(collect1);
        System.out.println("===============================");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<Integer> even = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());

        List<Integer> odd = numbers.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());

        List<Integer> list = new LinkedList<>();
        list.addAll(odd);
        list.addAll(even);
        System.out.println("List: " + list);

        System.out.println("=====================Sum of Integer in ArrayList Usinh Java8====================");
        List<Integer> numberss = Arrays.asList(1, 2, 3, 4, 5, 6);
        Integer sum = numberss.stream().reduce(0, Integer::sum);
        System.out.println(sum);
        Integer mul = numberss.stream().reduce(1, (a, b) -> a * b);
        System.out.println(mul);
    }
}
