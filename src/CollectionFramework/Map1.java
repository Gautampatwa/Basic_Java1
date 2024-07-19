package CollectionFramework;

import Day1.Employee;

import java.util.*;

public class Map1 {
    public static void main(String[] args) {

        Map<String, Map<String, Employee>> map1 = new LinkedHashMap<>();

        // Create inner maps and populate them with Employee objects
        Map<String, Employee> innerMap1 = new LinkedHashMap<>();
        innerMap1.put("Emp1", new Employee(13, 90000));
        Map<String, Employee> innerMap2 = new LinkedHashMap<>();
        innerMap2.put("Emp2", new Employee(8, 20000));
        Map<String, Employee> innerMap3 = new LinkedHashMap<>();
        innerMap3.put("Emp3", new Employee(9, 80000));

        // Add inner maps to the outer map
        map1.put("Employee Data 1", innerMap1);
        map1.put("Employee Data 2", innerMap2);
        map1.put("Employee Data 3", innerMap3);

        // Print the map
        for (var entry : map1.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        if (map1.containsKey("Employee Data 4")) {
            List<Employee> list = new ArrayList<>();
            list.add((Employee) map1.get("Employee Data 3"));
            System.out.println(list);
        }
    }
}
