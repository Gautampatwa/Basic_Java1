package Java8;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenOddPartitioning {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Map<Boolean, List<Integer>> partitionedNumbers = numbers.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        List<Integer> evens = partitionedNumbers.get(true);
        List<Integer> odds = partitionedNumbers.get(false);

        System.out.println("Even numbers: " + evens);
        System.out.println("Odd numbers: " + odds);
    }
}
