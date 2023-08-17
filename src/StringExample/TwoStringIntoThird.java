package StringExample;

import java.util.Scanner;

public class TwoStringIntoThird {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s1=scanner.nextLine();
        String s2=scanner.nextLine();
        integrate(s1,s2);
    }

    private static void integrate(String s1, String s2) {
        int max=Math.max(s1.length(),s2.length());
        StringBuilder builder=new StringBuilder();
        for(int i=0;i<max;i++)
        {
            if(i<s1.length())
            {
                builder.append(s1.charAt(i));
            }
            if(i<s2.length())
            {
                builder.append(s2.charAt(i));
            }
        }
        System.out.println(builder);
    }
}
