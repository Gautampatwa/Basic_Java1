package TwoPointers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SegregateOddAndEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        segregate(arr);
    }

    private static void segregate(int[] arr) {
        List<Integer> evenlist=new ArrayList<>();
        List<Integer> oddlist=new ArrayList<>();

            for(int a:arr)
            {
             if(a%2==0){
                 evenlist.add(a);
             }
             else {
                 oddlist.add(a);
                  }
            }
        evenlist.addAll(oddlist);
        System.out.println(evenlist);
    }
}
