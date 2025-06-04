package StringExample;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringReverse2 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        StringBuilder builder=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--)
        {
            builder.append(s.charAt(i));
        }
        System.out.println(builder);

    }
}
