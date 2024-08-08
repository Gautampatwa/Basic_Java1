package StringExample;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberPermutation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        List<List<Integer>> result = new ArrayList<>();
        List<List<Integer>> res=permutationOfNum(arr, new ArrayList<>(), result);
        System.out.println(res);
    }

    private static List<List<Integer>> permutationOfNum(int[] arr, List<Integer> tempList, List<List<Integer>> result) {

        if (tempList.size() == arr.length) {
            result.add(new ArrayList<>(tempList));
            return result;
        }
        for (int num : arr) {
            if (tempList.contains(num)) {
                continue;
            }
            tempList.add(num);
            permutationOfNum(arr, tempList, result);
            tempList.remove(tempList.size() - 1);
        }
        return result;
    }
}
