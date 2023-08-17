package StringExample;

import java.util.Scanner;

public class TwoStringLogic {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s1=scanner.nextLine();
        String s2=scanner.nextLine();
        char arr1[]=s1.toCharArray();
        char arr2[]=s2.toCharArray();
        int count=0;
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr2.length;j++)
            {
                if(arr1[i] != arr2[j] && arr1[i]!=' ')
                {
                    count++;
                    arr1[j]='1';
                }
            }
        }

        if(count>1)
        {
            System.out.println(count);
        }
    }
}
