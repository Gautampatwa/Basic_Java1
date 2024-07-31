package Arrays;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       while (true) {
           System.out.println("Enter an integer to reverse it or / to exit:");
           int n = sc.nextInt();
           if(n=='/')
           {
               break;
           }
           try {
               int rem = 0;
               int rev = 0;
               while (n != 0) {
                   rem = n % 10;
                   rev = rev * 10 + rem;
                   n = n / 10;
               }
               System.out.println(rev);
           }catch (InputMismatchException e){
               System.out.println("Input is not correct");
           }
       }
        System.out.println("Program Terminated");

    }
}
