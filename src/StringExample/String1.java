package StringExample;

import java.io.StringReader;

public class String1 {
    public static void main(String[] args) {
        String s = new String("Gautam");
        System.out.println(s);
        String s1="Gautam";
        String s2="Shivam";
        System.out.println(s1.length());
        System.out.println(s2.length());
        System.out.println(s1.toLowerCase());
        System.out.println(s2.toUpperCase());
        System.out.println(s2.compareTo(s1));
        System.out.println(s1.equals(s2));
        System.out.println("Gautam"+s1);
        System.out.println(s1.charAt(2));

        System.out.println("===============================================================");

        StringBuffer stringBuffer=new StringBuffer("Radhey");
        System.out.println(stringBuffer);
        stringBuffer.append('s');
        stringBuffer.append("Hello",0,5);
        System.out.println(stringBuffer);
        stringBuffer.delete(0,2);
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.capacity());
        System.out.println(stringBuffer.insert(1,"Pagal"));
        System.out.println(stringBuffer.indexOf("Radhey",3));

        System.out.println("=================================================================");

        StringReader stringReader=new StringReader("Pankaj");
        System.out.println(stringReader.equals("Gautam"));
        System.out.println(stringReader.toString().toLowerCase());
        System.out.println(stringReader.toString().compareTo("s".toLowerCase()));
        if (stringReader != null) {
            System.out.println("Not null");
        }
        return;

    }
}
