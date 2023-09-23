package StringExample;

import java.util.Scanner;

public class StringConsecutiveOccurence {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        String s1 = consecutiveOccurence(s);
        System.out.println(s1);
    }

    private static String consecutiveOccurence(String str) {

        StringBuilder builder=new StringBuilder();
        int count=1;

        for(int i=0;i<str.length()-1;i++)
        {
            char curr=str.charAt(i);
            if(curr==str.charAt(i+1))
            {
                count++;
            }
            else {
                builder.append(str.charAt(i));
                builder.append(count);
                count=1;
            }
        }
        builder.append(str.charAt(str.length()-1));
        builder.append(count);
        return builder.toString();
    }

}
