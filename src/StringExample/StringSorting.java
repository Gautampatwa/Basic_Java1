package StringExample;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringSorting {

    public static void main(String[] args) {
        List<String> strings = List.of("Gautam", "Ankur", "Chandi", "Mama", "Pakra", "Chakiya", "Ankur", "Mama");
        strings.forEach(System.out::println);
        System.out.println(strings.stream().sorted().collect(Collectors.toList()));
        List<String> sortedString=strings.stream().filter(e->e.startsWith("A")).collect(Collectors.toList());
        System.out.println(sortedString);
        List<String> sortedString1=strings.stream().sorted().collect(Collectors.toList());
        sortedString1.forEach(System.out::println);
        Stream<String> stringStream = sortedString1.stream().map(e -> e.trim().toLowerCase());
        stringStream.forEach(System.out::println);

        System.out.println("===============================================================================");

        String s1="Gautam";
        String s2="GautamPatwa";

        System.out.println(s1.toLowerCase());
        System.out.println(s2.toUpperCase());
        System.out.println(s1.compareTo(s2));
        System.out.println(s1==s2);
        System.out.println(s1.charAt(3));


        StringBuffer stringBuffer=new StringBuffer("Mukesh");
        stringBuffer.append(11);
        System.out.println(stringBuffer);
        stringBuffer.delete(6,8);
        System.out.println(stringBuffer);
        stringBuffer.append("Shivam");
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.lastIndexOf("h"));
        System.out.println(stringBuffer.indexOf("m"));



    }
}
