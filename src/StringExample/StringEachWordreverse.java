package StringExample;

import java.util.Scanner;

public class StringEachWordreverse {
    public static void main(String[] args) {
        Scanner sr=new Scanner(System.in);
        String s= sr.nextLine();
        String[] words=s.split(" ");
        StringBuilder reverse=new StringBuilder();
        for(String word:words)
        {
            StringBuilder builder=new StringBuilder();
            for(int i=word.length()-1;i>=0;i--)
            {
                builder.append(word.charAt(i));
            }
            reverse.append(builder).append(" ");
        }
        System.out.println(reverse.toString());
    }
}
