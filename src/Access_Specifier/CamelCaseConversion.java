package Access_Specifier;

public class CamelCaseConversion {
    public static void main(String[] args) {
        String str = "Hello wORLD JAVA";
        String[] words = str.split(" ");

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String word = words[i].toLowerCase();
            if (i == 0) {
                sb.append(word);
            } else {
                sb.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1));
            }
        }
        System.out.println(sb.toString());
    }
}
