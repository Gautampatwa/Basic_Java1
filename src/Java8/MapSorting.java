package Java8;

import java.util.*;
import java.util.stream.Collectors;

public class MapSorting {
    public static void main(String[] args) {

        Map<Employee, Integer> map = new TreeMap<>(Comparator.comparing(Employee::getName));
        map.put(new Employee("Gautam", "Delhi", "CSE", 52000), 10);
        map.put(new Employee("Maya", "Kolkata", "ECE", 93000), 40);
        map.put(new Employee("Akshay", "AP", "IT", 49000), 90);
        map.put(new Employee("Pankaj", "Bangalore", "SECURITY", 19200), 30);
        map.put(new Employee("Suresh", "Gurgaon", "KT", 13000), 80);
        map.put(new Employee("Banti", "Punjab", "FINANCIAL", 10012), 224);

        map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getMobile))).forEach(System.out::println);

        System.out.println("========================StreamAPI=======================");
        List<String> list = Arrays.asList("Gautam", "Mukesh", "Akanksha", "Manvi", "Prerna");
        list.forEach(System.out::println);
        list.stream().sorted().filter(i -> i.startsWith("M")).forEach((li) -> System.out.println("I love you " + li));

        //FLatMap
        List<List<Integer>> lists = Arrays.asList(Arrays.asList(1, 3, 2, 5, 4, 6, 7, 89), Arrays.asList(2, 3, 4, 6, 7, 8));
        List<Integer> list1 = Arrays.asList(12, 23, 13, 32, 4, 5, 9, 48, 93, 2, 44, 5, 2);
        List<Integer> collect = lists.stream().flatMap(List::stream).distinct().collect(Collectors.toList());
        List<Integer> collect1 = list1.stream().map(i -> i * 2).sorted().distinct().collect(Collectors.toList());
        System.out.println(collect);
        System.out.println(collect1);
        System.out.println("=========================String==========================");
        String s1="Gautam";
        String s2="Gautam";
        String s3=new String("Gautam");
        String s4=new String("Gautam");
        StringBuffer buffer1=new StringBuffer("Gautam");
        StringBuffer buffer2=new StringBuffer("Gautam");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s3==s4);
        System.out.println(" "+s3.equals(s4));
        System.out.println(buffer2==buffer1);
        System.out.println(buffer1.equals(buffer2));
        System.out.println(s1==s3);//false
        System.out.println(s1.equals(s3));//true
        System.out.println(s1.equals(buffer1));
        System.out.println(s1.equals(s3));
        System.out.println("==========================================");
        Employee employee2=new Employee("Gautam", "Delhi", "CSE", 52000);
        Employee employee3=new Employee("Gautam", "Delhi", "CSE", 52000);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println(employee2==employee3);
        System.out.println(employee2.equals(employee3));


        List<Employee> employeeList=Arrays.asList(
                new Employee("Gautam", "Delhi", "CSE", 5300),
        new Employee("Gautam", "Govind", "CSE", 3000),
                new Employee("Gautam", "Punjab", "CSE", 12000),
                new Employee("Gautam", "Mumbai", "CSE", 84000)
        );
        List<Employee> collect2 = employeeList.stream().filter(s -> s.getSalary() < 12000).collect(Collectors.toList());
        for(Employee e:collect2)
        {
            System.out.println(e.getAddress());
        }
    }
}