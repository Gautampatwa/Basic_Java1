package Arrays;

public class Sort012UsingThreePointers {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 0, 2, 0, 2, 2, 1, 1, 1, 0};
        int left = 0;
        int mid = 0;
        int right = arr.length - 1;
        while (mid < right) {
            if (arr[mid] == 0) {
                swap(arr, mid, left);
                left++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                swap(arr, mid, right);
                right--;
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    private static void swap(int[] arr, int l, int r) {
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }
}
