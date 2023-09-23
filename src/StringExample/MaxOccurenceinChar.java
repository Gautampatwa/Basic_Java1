package StringExample;

import java.util.Scanner;

public class MaxOccurenceinChar {
    public static void main(String[] args) {
        //
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter string:");
        String str=scanner.nextLine();
        int arr[]=new int[256];
        for(int i=0;i<str.length();i++)
        {
            arr[str.charAt(i)]+=1;
        }
        int max=0;
        char c=' ';
        for(int i=0;i<str.length();i++) {
            if (max < arr[str.charAt(i)]) {
                max = arr[str.charAt(i)];
                c = str.charAt(i);

            }
        }
        System.out.println("Max Occurence character is:"+c);
    }
}
