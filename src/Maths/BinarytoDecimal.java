package Maths;

import java.util.Scanner;

public class BinarytoDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int dec = 0;
        int i = 0;
        int rem;
        while (n != 0) {
            rem = n % 10;
            n = n / 10;
            dec = (int) (dec + rem * Math.pow(2, i));
            ++i;
        }
        System.out.println(dec);
        System.out.println("==============================================");
        System.out.println("Enter Decimal to convert into Binary");
        int m=scanner.nextInt();
        int j=0;//
        int[] binary=new int[1000];
        while(m>0)
        {
            binary[j]=m%2;
            m=m/2;
            j++;
        }
        for(int k=j-1;k>=0;k--) {
            System.out.print(binary[k]);
        }
    }

}