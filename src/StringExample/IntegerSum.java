package StringExample;

import java.util.Scanner;

public class IntegerSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Integer a =sumOfInteger(s);
        System.out.println(a);
    }
    private static int sumOfInteger(String s) {
        int sum=0;
        for(char c:s.toCharArray())
        {
            if (Character.isDigit(c)) { // Check if character is a digit
                sum += Character.getNumericValue(c); // Convert char to int and add to sum
            }
        }
        return sum;
    }

}
