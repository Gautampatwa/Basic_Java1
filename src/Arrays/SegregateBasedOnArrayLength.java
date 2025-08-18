package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SegregateBasedOnArrayLength {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        List<Integer> leftList = new ArrayList<>();
        List<Integer> rightList = new ArrayList<>();
        List<Integer> finalList = new LinkedList<>();

        int n = arr.length;
        int m = n / 2; // Midpoint index

        for (int i = 0; i < m; i++) {
            leftList.add(arr[i]);
        }
        for (int i = m+1; i < n; i++) {
            rightList.add(arr[i]);
        }
        Collections.sort(leftList);
        leftList.add(arr[m]);
        Collections.sort(rightList, Collections.reverseOrder());
        finalList.addAll(leftList);
        finalList.addAll(rightList);

        System.out.println(finalList);
    }
}