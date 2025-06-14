package StringExample;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CharCountInString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        int sum=0;
        for(char c:s.toCharArray())
        {
            if(Character.isDigit(c))
            {
                sum+=Character.getNumericValue(c);
            }
        }
        System.out.println(sum);
    }
}
