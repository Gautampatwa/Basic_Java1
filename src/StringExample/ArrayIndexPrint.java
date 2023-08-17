package StringExample;

import java.util.Scanner;

public class ArrayIndexPrint {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        String s=String.valueOf(n);
        char target='2';
        int index=s.indexOf(target);
        System.out.println(index);
        }
}
