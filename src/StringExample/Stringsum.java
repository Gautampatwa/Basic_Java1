package StringExample;

//import org.junit.platform.commons.logging.Logger;
//import org.junit.platform.commons.logging.LoggerFactory;

import java.util.Scanner;

public class Stringsum {
    public static void main(String[] args) {

//        Logger logger = LoggerFactory.getLogger(Stringsum.class);
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            int digit=Integer.parseInt(String.valueOf(ch));
            sum+=digit;
        }
        System.out.println(sum);
    }
}
