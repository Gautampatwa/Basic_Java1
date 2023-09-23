package StringExample;
import java.util.ArrayList;
import java.util.List;

public class LineWrapper {
    public static void main(String[] args) {
        String[] words1 = {"The", "day", "began", "as", "still", "as", "the", "night", "abruptly", "lighted", "with", "brilliant", "flame"};
        int lineLength1 = 13;
        int lineLength2 = 8;
        int lineLength3 = 20;

        List<String> wrappedLines1 = wrapLines(words1, lineLength1);
        List<String> wrappedLines2 = wrapLines(words1, lineLength2);
        List<String> wrappedLines3 = wrapLines(words1, lineLength3);

        System.out.println("Wrap words1 to line length " + lineLength1);
        System.out.println(wrappedLines1);

        System.out.println("Wrap words1 to line length " + lineLength2);
        System.out.println(wrappedLines2);

        System.out.println("Wrap words1 to line length " + lineLength3);
        System.out.println(wrappedLines3);
    }

    public static List<String> wrapLines(String[] words, int lineLength) {
        List<String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            if (sb.length() + word.length() <= lineLength) {
                if (sb.length() > 0) {
                    sb.append("-");
                }
                sb.append(word);
            } else {
                result.add(sb.toString());
                sb.setLength(0);  // Clear the current line
                sb.append(word);
            }
        }

        if (sb.length() > 0) {
            result.add(sb.toString());
        }

        return result;
    }
}

