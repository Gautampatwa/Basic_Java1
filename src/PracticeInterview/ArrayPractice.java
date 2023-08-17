package PracticeInterview;

import java.util.ArrayList;
import java.util.List;

public class ArrayPractice {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        System.out.println(list);
        System.out.println(list.size());
        list.add("Gautam");
        list.add("Mukesh");
        list.add("Rakesh");
        System.out.println(list.size());
        System.out.println(list);
        for(String i:list)
        {
            System.out.println(i);
        }
        System.out.println("=============================");
        list.forEach(e-> System.out.println(e));
        list.remove("Rakesh");
        System.out.println("=============================");
        list.forEach(e-> System.out.println(e));
        System.out.println("=====================filter=====================");

        list.stream().filter(e->e.startsWith("Ga")).forEach(System.out::println);
        System.out.println("======================STREAM=====================");
        List<String> list2=List.of("Gautam","Mukes","Pritesh","Mukes");
        list2.stream().sorted().forEach(System.out::println);
        list2.stream().filter(e->e.equals("Mukes")).forEach(System.out::println);
        list2.stream().filter(e->e.endsWith("es")).forEach(System.out::println);
    }
}
