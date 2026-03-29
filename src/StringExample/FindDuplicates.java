package StringExample;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicates {
    public static void main(String[] args) {
        String str="abbccdefdg";
        Set<Character> set=new HashSet<>();
        Set<Character> duplicate=new HashSet<>();
        for(char c:str.toCharArray()){
            System.out.println(c+":"+set.add(c));
            if(!set.add(c)) {
                duplicate.add(c);
            }

        }
        System.out.println(duplicate);

    }
}
