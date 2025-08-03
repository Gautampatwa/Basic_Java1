package Java8;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateWords {
    public static void main(String[] args) {
        String input = "Java is great and Java is fun";
        String[] input2=input.split(" ");
        Map<String, Long> duplicates = Arrays.stream(input2)
                .map(String::toLowerCase) // optional: ignore case
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println("Duplicate words:");
        duplicates.forEach((k, v) -> System.out.println(k + " -> " + v));
    }
}
