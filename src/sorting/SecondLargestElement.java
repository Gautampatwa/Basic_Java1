package sorting;
public class SecondLargestElement {
    public static int findSecondLargest(int[] arr) {
        int max =0; // Maximum element
        int secondMax =0; // Second maximum element

        for (int i = arr.length-1; i >=0; i--) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        System.out.println(max);
        return secondMax;
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 12, 3};
        int secondLargest = findSecondLargest(arr);
        System.out.println("Second largest element: " + secondLargest);
    }
}
