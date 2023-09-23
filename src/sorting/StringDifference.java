package sorting;
import java.util.Scanner;

public class StringDifference {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s= scanner.nextLine();
        String s1=scanner.nextLine();
        char c = 0;
        for(char cs : s.toCharArray()) c ^= cs;
        for(char ct : s1.toCharArray()) c ^= ct;
        System.out.println(c);
    }
}