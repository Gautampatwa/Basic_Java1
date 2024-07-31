package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<Integer> ls= Arrays.asList(1,2,2,3,4,4,5);
        List<Integer> ls1=new ArrayList<>(ls);
        ls1.stream().filter(i->i%2==0).forEach(System.out::println);
        System.out.println(ls1);
    }
}
