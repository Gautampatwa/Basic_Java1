package StringExample;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        int n=s.length();
        int c=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<=n;j++)
            {
                System.out.println(s.substring(i,j)+ " ");
                c++;
            }
        }
        System.out.println(c);
        System.out.println("=============================================");
        int[] arr= new int[]{1,2,3,4,5,6};
        int a=arr[arr.length-1]++;
        System.out.println(a);
    }
}
