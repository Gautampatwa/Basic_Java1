package Access_Specifier;

public class Hello {
    public static void main(String[] args) {
        String s1 = "Gautmra";
        String s2 = "Sourabh";
        char arr1[] = s1.toCharArray();
        char arr2[] = s2.toCharArray();
        int ch1 = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {

                if (s1.charAt(i) == s2.charAt(j)) {
                    ch1=ch1+1;
                    System.out.println(s1.charAt(i));
                }
            }
        }
    }
}
