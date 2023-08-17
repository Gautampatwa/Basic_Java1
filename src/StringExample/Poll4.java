package StringExample;

public class Poll4 {
    public static void main(String[] args) {
        String s1="race";
        String s2="race";

        char[] ch1=s1.toCharArray();
        char[] ch2=s2.toCharArray();

        System.out.println(ch1);
        System.out.println(ch1+":"+ch2);

        System.out.println(s1+" "+s2);
        System.out.println(1+2+5+" "+s2+" "+23+22+221);
        System.out.println(s1.compareTo(s2));
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
    }
}
