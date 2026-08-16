package Java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FIrsNonRepeatingUsingJava8 {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("swiss","abbacbs","sanaka");
        List<Character> nonRepeatingList=new ArrayList<>();
        for(String s:list) {
            Character c = firstNonRepeatingChar(s);
            nonRepeatingList.add(c);
        }
        System.out.println(nonRepeatingList);

    }

    private static Character firstNonRepeatingChar(String str) {

        Map<Character,Long> map=str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(
                Function.identity(), LinkedHashMap::new,Collectors.counting()));

        Character res;
        res = map.entrySet().stream().filter(e->e.getValue()==1).map(Map.Entry::getKey)
                .findFirst().orElse(null);
        return res;
    }
}
