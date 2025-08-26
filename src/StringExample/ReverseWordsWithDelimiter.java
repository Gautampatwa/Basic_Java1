package StringExample;

public class ReverseWordsWithDelimiter {
    public static void main(String[] args) {
        String st = "how are you";
        String[] words = st.split(" ");
        StringBuilder reverseword = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            StringBuilder builder = new StringBuilder(words[i]);
            reverseword.append(builder.reverse());
            if(i<words.length-1)
            {
                reverseword.append(" ");
            }
        }
        String s=reverseword.toString();
        s = s.replaceAll("\\s+", "\\$");
        System.out.println(s);
    }
}