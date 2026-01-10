package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Gautam", "Mukesh", "Suresh", "Pankaj");
        List<String> finalList = list.stream().filter(s -> s.endsWith("sh")).
                collect(Collectors.toList());
        System.out.println(finalList);
    }
}
