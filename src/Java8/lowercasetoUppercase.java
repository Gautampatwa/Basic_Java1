package Java8;


import java.util.Arrays;
import java.util.List;

public class lowercasetoUppercase {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("hello","Gautam","pankaj");
        list.stream().map(i->i.toUpperCase()).forEach(System.out::println);
    }
}
