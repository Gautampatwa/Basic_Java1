package StringExample;

import java.util.Scanner;

public class MaxElementinArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }
        Integer max=maxOccurenceinArr(arr);
        System.out.println(max);
    }

    private static int maxOccurenceinArr(int[] arr) {
        int c=arr[0];
        int count=1;

        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]==c)
            {
                count++;
            }
            else {
                count--;
                if(count==0)
                {
                    c=arr[i];
                    count=1;
                }
            }
        }
        return c;

    }
}
