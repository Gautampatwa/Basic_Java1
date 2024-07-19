package StringExample;

import Day1.Employee;
import Lambda1.MyInter;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapWithEntityPractice {
    public static void main(String[] args) {

        Map<String, List<Employee>> map=new TreeMap<>();
        map.put("Mukesh", Arrays.asList(new Employee(1,1l),new Employee(12,8l)));
        map.put("Satyam",Arrays.asList(new Employee(231,12l)));
        map.put("Pawan",Arrays.asList(new Employee(12238,9938l)));
        map.put("Pawan",Arrays.asList(new Employee(72,9938l)));

        if(map.containsKey("Pawan")) {
            map.replace("Pawan", Arrays.asList(new Employee(992, 28l)));
        }
        System.out.println(map);
        System.out.println("=============================================================");

        for(int i=0;i<10;i++)
        {
            for(int j=0;j<20;j++) {
                long startTime = System.currentTimeMillis();
                System.out.println(i + ":" + j);
                long endTime = System.currentTimeMillis();
            }
        }
        System.out.println("================================================================");

        List<Integer> list=Arrays.asList(1,2,4,5,6,7,12,3,45,6,64);
        MyInter i=(()->{
            System.out.println("Hello gautam");
        });
        i.sayHello();

        for(var e:list)
        {
            System.out.println(e);
        }
        System.out.println("=============USING FOREACH===================================");
        list.stream().forEach((e)->{
            System.out.println(e);
        });
       List<Integer> list1=list.stream().filter((integer)->integer%2==0).collect(Collectors.toList());
        System.out.println(list1);

        System.out.println(list);
       List<Integer> list2= list.stream().map((a)->a*a).collect(Collectors.toList());
        System.out.println(list2);

       List<Integer> list3=list.stream().filter((i1)->i1%3==0).sorted().collect(Collectors.toList());
       list3.forEach(System.out::println);




    }

}
