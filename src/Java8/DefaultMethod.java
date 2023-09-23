package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

interface I {
    default void m1() {
        System.out.println("Default Interface called");
    }
}

public class DefaultMethod implements I {
    public static void main(String[] args) {
        DefaultMethod defaultMethod=new DefaultMethod();
        defaultMethod.m1();
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        List<Integer> collect = names.stream()
                .map(String::length).collect(Collectors.toList());
//              .collect(Collectors.toList());
        System.out.println(collect);
        collect.forEach(System.out::println);

    }
}
