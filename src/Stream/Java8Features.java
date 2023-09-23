package Stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Features {
    public static void main(String[] args) {
        List<Integer> arrayList = Arrays.asList(9, 7, 5, 4, 6, 1, 2, 8, 3);
        List<Integer> collect = arrayList.stream().sorted().filter(i -> i > 3).collect(Collectors.toList());
        List<Integer> collect2 = arrayList.stream().sorted((i1, i2) -> i2.compareTo(i1)).collect(Collectors.toList());
        List<Integer> collect1 = arrayList.stream().sorted().collect(Collectors.toList());
        System.out.println(collect);
        System.out.println(collect2);
        System.out.println(collect1);
        List<Integer> collect4 = arrayList.stream().sorted().map(i -> i * i).collect(Collectors.toList());
        List<Integer> collect3 = arrayList.stream().sorted().map(i -> i + 5).collect(Collectors.toList());
        System.out.println(collect3);
        System.out.println(collect4);
        List<Employee> list = Arrays.asList(new Employee("Gautam", "Delhi", "99383", 122),
                new Employee("Mukesh", "Mumbai", "8283", 2211),
                new Employee("Radhey", "Ludhian", "8832", 8347),
                new Employee("Manan", "Jalandhar", "9816", 2939),
                new Employee("Pankaj", "Hyderabad", "0092", 6453),
                new Employee("Kokila", "Pune", "1522", 9949));
        Map< Employee,Integer> hashMap = new TreeMap<>(Comparator.comparing(Employee::getName));
        hashMap.put(new Employee("Gautam", "Delhi", "99383", 122),1);
        hashMap.put( new Employee("Mukesh", "Mumbai", "8283", 2211),23);
        hashMap.put(new Employee("Radhey", "Ludhiana", "8832", 8347),9);
        hashMap.put( new Employee("Manan", "Jalandhar", "9816", 2939),29);
        hashMap.put( new Employee("Pankaj", "Hyderabad", "0092", 6453),81);
        hashMap.put(new Employee("Kokila", "Pune", "1522", 9949),12);
        hashMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getAddress))).forEach(System.out::println);
        System.out.println("===============================================");
        for(Employee e:hashMap.keySet())
        {
            System.out.println(e);
        }
    }
}
