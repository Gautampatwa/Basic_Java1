package StringExample;

import java.util.Scanner;

public class StringIndividualWordReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=====================METHOD1====================");
        String s = scanner.nextLine();
        String[] words=s.split(" ");
        StringBuilder reverseword=new StringBuilder();

        for(String word:words)
        {
            StringBuilder builder=new StringBuilder();
            for(int i=word.length()-1;i>=0;i--)
            {
                builder.append(word.charAt(i));
            }
            reverseword.append(builder).append(" ");
        }
        System.out.println(reverseword.toString().trim());
    }
}
