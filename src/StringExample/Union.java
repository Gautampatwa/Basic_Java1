package StringExample;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Union {
    public static void main(String[] args) {
        Set<String> s1= Set.of("gautam","Mukesh","pankaj");
        Set<String> s2= Set.of("raju","pankaj","naveen");
        Set<String> union= Stream.concat(s1.stream(),s2.stream()).collect(Collectors.toSet());
        System.out.println(union);
        Set<String> interSection=s1.stream().filter(s2::contains).collect(Collectors.toSet());
        System.out.println(interSection);

    }
}
