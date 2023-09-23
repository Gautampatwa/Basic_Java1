package Stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {

    public static void main(String[] args) {
        List<Integer> list1 = List.of(2, 22, 14, 12, 64, 13);
        System.out.println(list1);


        List<Integer> listEven = list1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(listEven);
        listEven.forEach(System.out::println);

        //Collections,List,set
        System.out.println("===============================================================");
        List<Integer> list2 = new ArrayList<>();
        list2.add(21);
        list2.add(12);
        list2.add(224);
        list2.add(348);
        list2.add(2);

        Stream<Integer> stream1 = list2.stream().filter(i -> i % 2 == 0);
        stream1.forEach(System.out::println);

      /*  String stream2= Stream.empty().toString();
        System.out.println(stream2);*/
        System.out.println("====================FILTER FUNCTIONS========================");
        List<String> stringList = List.of("Haddi", "Govinda", "Pakra", "Kamal");
        List<Integer> integers=List.of(21,2,41,31,22,383);
        System.out.println(integers);
        List<String> list = stringList.stream().filter(e -> e.endsWith("a")).collect(Collectors.toList());
        System.out.println(list);
        list.forEach(System.out::println);

        System.out.println("======================Map Function============================");
        List<Integer> squareList = list1.stream().map(i -> i * i).collect(Collectors.toList());
        System.out.println(squareList);

        squareList.stream().sorted().forEach(System.out::println);


        System.out.println("================================================================================");

        List<Integer> list4 = List.of(221, 2, 2, 13, 1, 1, 23, 1114, 41, 411, 5);
        list4.forEach(System.out::println);
        List<Integer> liste = list4.stream().sorted().collect(Collectors.toList());
        System.out.println("........................Sorted String........................");
        liste.forEach(System.out::println);
        System.out.println("==================================================================");
        List<Integer> distinct = list4.stream().distinct().collect(Collectors.toList());
        distinct.stream().sorted().forEach(System.out::println);


        System.out.println("==================================MAP========================================");
        Map<Integer, List> map = new HashMap<>();
        map.put(1, Arrays.asList(11, 2, 3112, 31, 411));
        map.put(2, Arrays.asList(11, 2, "3112", 31, 411));
        map.put(3, Arrays.asList(11, 2, 3112, 31, 411));
        map.put(33, Arrays.asList(11, 2, 3112, 31, 411));
        System.out.println(Arrays.asList(map));
        map.forEach((key, value) -> System.out.println(key + ":" + value));
        System.out.println(map.containsKey(33));
        System.out.println(map.get(3));
        System.out.println(map.size());

    }
}
