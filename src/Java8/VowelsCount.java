package Java8;

import java.util.*;
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
        Integer max = numberss.stream().reduce(Integer.MIN_VALUE, Integer::max);
        System.out.println(max);
        Integer min = numberss.stream().reduce(Integer.MAX_VALUE, Integer::min);
        System.out.println(min);
        System.out.println("Reverse Arraylist");
        numberss.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        System.out.println("=========================================");
        String s1="Gautam is a good inspiration";
        s1=s1.toLowerCase();
        Arrays.stream(s1.split(" ")).forEach(
                word->{
                    Map<Character,Long> vowelcount=word.chars().mapToObj(c->(char)c).filter(c->"aeiou".indexOf(c)!=-1).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
                    System.out.println(word+":"+"Vowels Count: "+vowelcount);
                });

        System.out.println("=========================================");
        Arrays.stream(s1.split(" ")).map(String::toUpperCase).forEach(System.out::println);
        System.out.println("================================================");
        Arrays.stream(s1.split(" ")).filter(c->c.startsWith("g")).forEach(System.out::println);
        System.out.println("==================Reverse===============");

        List<String> list2=Arrays.stream(s1.split(" ")).map(c->new StringBuilder(c).reverse().toString()).collect(Collectors.toList());
        System.out.println(list2);

        String reversed = Arrays.stream(s1.split(" "))
                .collect(Collectors.collectingAndThen(
                        Collectors.toList(),
                        word -> {
                            Collections.reverse(word);
                            return String.join(" ", word);
                        }
                ));

        System.out.println(reversed);


    }
}
