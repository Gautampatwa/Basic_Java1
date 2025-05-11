package StringExample;

import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateCharactersUsingJava8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        Map<Character, Long> map = s.chars().mapToObj(c -> (char) c).
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        map.entrySet().stream().filter(i -> i.getValue() > 1).
                forEach(e -> System.out.println(e.getKey() + ":" + e.getValue()));
    }
}
