package Access_Specifier;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeStream {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Bob","Admin",62000),
                new Employee("Alice","Admin",58000),
                new Employee("Karan","IT",85000),
                new Employee("David","IT",72000),
                new Employee("Edward","Admin",67000)
        );

        List<Employee> sortedEmp=employees.stream().sorted(Comparator.comparing(Employee::getRole).thenComparing(
                Comparator.comparingDouble(Employee::getSalary).reversed())).collect(Collectors.toList());

        sortedEmp.forEach(System.out::println);
    }
}
