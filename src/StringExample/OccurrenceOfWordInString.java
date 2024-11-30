package StringExample;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OccurrenceOfWordInString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        System.out.println("Enter string to find occurrence:");
        String s= sc.nextLine();
        int c = 0;
        Pattern p=Pattern.compile(s);
        Matcher m=p.matcher(input);
        while (m.find())
        {
            c++;
        }
        System.out.println("occurrence :"+c);
    }
}
