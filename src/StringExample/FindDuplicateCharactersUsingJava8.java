package StringExample;

import Loop.Palindrome;

import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateCharactersUsingJava8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        Map<Character, Long> map = s.chars().mapToObj(c -> (char) c).
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        map.entrySet().stream().filter(i -> i.getValue() > 1).
                forEach(e -> System.out.println(e.getKey() + ":" + e.getValue()));

        System.out.println("============Reverse a word=========================");
        String[] words = s.split(" ");
        StringBuilder rev = new StringBuilder();
        for (String word : words) {
            StringBuilder builder = new StringBuilder();
            for (int i = word.length() - 1; i >= 0; i--) {
                builder.append(word.charAt(i));
            }
            rev.append(builder).append(" ");
        }
        System.out.println(rev.toString().trim());
        System.out.println("=========Reverse String and reverse each word===========");
        StringBuilder rev1=new StringBuilder();
        String[] words1=s.split(" ");
        for(int i=words1.length-1;i>=0;i--)
        {
            String word=words[i];
            for(int j=word.length()-1;j>=0;j--)
            {
                rev1.append(word.charAt(j));
            }
            if(i!=0)
            {
                rev1.append(" ");
            }
        }
        System.out.println(rev1.toString());
    }
}
