package StringExample;

public class StringSwapping {
    public static void main(String[] args) {
        String s1="Gautam";
        String s2="Patwa";
        System.out.println(s1+" "+s2);
        s1=s1+s2;
        s2=s1.substring(0,s1.length()-s2.length());
        s1=s1.substring(s2.length());
        System.out.println(s1+" "+s2);

        int a=10,b=5;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a+":"+b);
    }
}
