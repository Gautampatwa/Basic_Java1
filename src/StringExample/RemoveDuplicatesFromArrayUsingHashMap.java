package StringExample;

import java.util.*;

public class RemoveDuplicatesFromArrayUsingHashMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        List<Integer> list = removeduplicates(arr);
        for (int i : list) {
            System.out.print(i + " ");
        }
    }

    private static List<Integer> removeduplicates(int[] arr) {

        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            if (!map.containsKey(i)) {
                list.add(i);
                map.put(i, 1);
            }
        }
        return list;
    }
}
