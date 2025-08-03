package StringExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NoOfVowelsinWords {

    public static void main(String[] args) {
        String s = "Mukesh is a very good boy";
        String[] s2 = s.split(" ");
        for (String s1 : s2) {
            noOfVowels(s1.toLowerCase());
        }
        System.out.println("Second approach Using Java8");
        Arrays.stream(s.split(" ")).forEach(word -> {
            List<Character> vowels = word.toLowerCase().chars() // IntStream
                    .mapToObj(c -> (char) c).filter(c -> "aeiou".indexOf(c)!=-1).collect(Collectors.toList());
            System.out.println(word + " -> Vowels: " + vowels);
        });
    }

    private static void noOfVowels(String s) {
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ('a') || s.charAt(i) == ('e') || s.charAt(i) == ('i') || s.charAt(i) == ('o') || s.charAt(i) == ('u')) {
                list.add(s.charAt(i));
            }
        }
        System.out.println(list);
    }

}