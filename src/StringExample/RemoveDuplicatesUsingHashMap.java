package StringExample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class RemoveDuplicatesUsingHashMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of Array:");
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        List<Integer> integers = removeDuplicates(arr);
        for (int i : integers) {
            System.out.print(i + " ");
        }

    }

    private static List<Integer> removeDuplicates(int[] arr) {
        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int n : arr) {
            if (!map.containsKey(n)) {
                list.add(n);
                map.put(n, 1);
            }
        }
        return list;
    }
}
