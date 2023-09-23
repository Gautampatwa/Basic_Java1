package sorting;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveOccurenceofTargetValueinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int target = 8;
        ArrayList<Integer> arr1 = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        deleteTarget(arr, arr1, target);
    }

    private static void deleteTarget(int[] arr, ArrayList<Integer> arr1, int target) {

        for (int i = 0;i < arr.length; i++) {
            if (arr[i] != target) {
                arr1.add(arr[i]);
            }
        }
        System.out.println(arr1);
    }
}
