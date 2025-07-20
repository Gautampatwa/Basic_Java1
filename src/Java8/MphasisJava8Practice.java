package Java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MphasisJava8Practice {
    public static void main(String[] args) {
        List<Employee> list= Arrays.asList(
                new Employee("Mukesh","Delhi","99",1001),
                new Employee("Suresh","Patna","99",3392),
                new Employee("Sushil","Bangalore","99",9000),
                new Employee("Pankaj","Delhi","99",790));

        Map<String, List<Employee>> collect = list.stream().collect(Collectors.groupingBy(Employee::getAddress));
        List<Employee> patna = collect.get("Delhi");
        for (Employee employee : patna) {
            System.out.println(employee.getName());
        }

        list.stream().max(Comparator.comparing(Employee::getSalary).reversed()).ifPresent(System.out::println);
        list.stream().filter(s -> s.getName().startsWith("S") && s.getSalary() > 500).forEach(System.out::println);
        System.out.println("Employee sorted By Address:");
        list.stream().sorted(Comparator.comparing(Employee::getAddress)).forEach(System.out::println);
    }
}
