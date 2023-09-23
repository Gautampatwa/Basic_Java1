package StringExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringWrapUp {
    public static void main(String[] args) {
        String[] words = {"Hello", "Gautam", "How", "are", "you", "Is", "everything", "going", "good", "or", "bad"};
//        Arrays.sort(words);
        int lineslength1 = 6;
        int lineslength2 = 11;
        int lineslength3 = 16;
        List<String> list = wrapLines(words, lineslength1);
        List<String> list2 = wrapLines(words, lineslength2);
        List<String> list3 = wrapLines(words, lineslength3);
        System.out.println(list);
        System.out.println(list2);
        System.out.println(list3);
    }

    private static List<String> wrapLines(String[] words, int length) {
        List<String> result = new ArrayList<>();
        StringBuilder builder = new StringBuilder();

        for (String word : words) {
            if (builder.length() + word.length() <= length) {
                if (builder.length() > 0) {
                    builder.append("-");
                }
                builder.append(word);
            } else {
                result.add(builder.toString());
                builder.setLength(0);
                builder.append(word);
            }
        }
        if (builder.length() > 0)
            result.add(builder.toString());
        return result;
    }
}
