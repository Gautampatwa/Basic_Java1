package FinexraInterviewPreparation;

import java.util.Scanner;

public class RemoveDuplicatesinString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        char arr[]=s.toCharArray();
        int c=1;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j< arr.length;j++)
            {
                if(arr[i]==arr[j] && arr[i]!=' ')
                {
                c++;
                arr[j]='1';
                }
            }
            if(c>1 && arr[i]!='1')
            {
                System.out.print(arr[i]+" ");
            }
        }
    }
}
