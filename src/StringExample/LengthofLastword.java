package StringExample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LengthofLastword {
    public static void main(String[] args) {
        String str = "Hello howo are you";
        String s1 = Arrays.stream(str.split(" ")).limit(2).reduce((f, s) -> f).orElse("not found");
        List<String> words = Arrays.stream(str.split(" ")).collect(Collectors.toList());
        String res = words.size() > 1 ? words.get(1) : " ";
        System.out.println(s1);
        System.out.println(res);
        System.out.println("Length of second word is:");
        Integer integer = Arrays.stream(str.split(" ")).skip(1).map(String::length).findFirst().orElse(0);
        System.out.println(integer);
        System.out.println("==========Length of last word is:================");
        int length = 0;
        int lastLength = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                length++;
            } else {
                lastLength = length;
                length = 0;
            }
        }
        lastLength = length;
        System.out.println(lastLength);
    }
}
