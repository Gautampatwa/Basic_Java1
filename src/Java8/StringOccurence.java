package Java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringOccurence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Map<Character, Long> map = s.chars().mapToObj(c -> (char) c).
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        map.entrySet().stream().filter(v -> v.getValue() > 1).
                forEach(e -> System.out.println(e.getKey() + " = " + e.getValue()));

        System.out.println("=========================");
        String s1="Hello Gautam how";
        List<String> collect = Arrays.stream(s1.split(" ")).map(w -> w.substring(0, 1)).collect(Collectors.toList());
        System.out.println(collect);
    }
}
