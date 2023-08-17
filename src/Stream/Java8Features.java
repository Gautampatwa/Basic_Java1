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
        List<Employee> collect5 = list.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).collect(Collectors.toList());
        HashMap<Integer, Employee> hashMap = new HashMap<Integer, Employee>();
        hashMap.put(1, new Employee("Gautam", "Delhi", "99383", 122));
        hashMap.put(2, new Employee("Mukesh", "Mumbai", "8283", 2211));
        hashMap.put(3, new Employee("Radhey", "Ludhiana", "8832", 8347));
        hashMap.put(4, new Employee("Manan", "Jalandhar", "9816", 2939));
        hashMap.put(5, new Employee("Pankaj", "Hyderabad", "0092", 6453));
        hashMap.put(7, new Employee("Kokila", "Pune", "1522", 9949));
        System.out.println(collect5.get(0));
        for (Employee e : hashMap.values()) {
            if (e.getSalary() == 2211) {
                System.out.println(e.toString());
            }
        }

    }
}
