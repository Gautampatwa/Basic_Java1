package Access_Specifier;

public class StringValueof {
    public static void main(String[] args) {

        char ch1 = 'A';
        char ch2 = 'B';
        String s1 = String.valueOf(ch1);
        String s2 = String.valueOf(ch2);
        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println(s1);
        System.out.println(s2);

        float f  = 10.05f;
        double d = 10.02;
        String s11 = String.valueOf(f);
        String s22 = String.valueOf(d);
        System.out.println(s11);
        System.out.println(s22);
        System.out.println(f);
        System.out.println(d);
    }
}
