package Java8;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetPractice {
    public static void main(String[] args) {

        LinkedHashSet<String> set= new LinkedHashSet<>();
        set.add("Priyanka");
        set.add("Muehsh");
        set.add("Pankaj");
        set.add("Monika");
        set.add("Gautam");
        set.add("Gautam");
        System.out.println(set);


        HashSet<String> set1= new HashSet<>();
        set1.add("Priyanka");
        set1.add("Muehsh");
        set1.add("Pankaj");
        set1.add("Monika");
        set1.add("Gautam");
        set1.add("Gautam");
        System.out.println(set1);


        Set<String> set2= new TreeSet<>();
        set2.add("Priyanka");
        set2.add("Muehsh");
        set2.add("Pankaj");
        set2.add("Monika");
        set2.add("Gautam");
        set2.add("Gautam");
        System.out.println(set2);

    }
}
