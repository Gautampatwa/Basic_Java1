package sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class segragateEvenOddUsingJava {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        List<Integer> listeven = new ArrayList<>();
        List<Integer> listodd = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                listeven.add(arr[i]);
            } else {
                listodd.add(arr[i]);
            }
        }
        int[] result = new int[n];
        int index = 0;

        for (int num : listeven) {
            result[index++] = num;
        }

        for (int num : listodd) {
            result[index++] = num;
        }
        System.out.println("Array after segregation:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
