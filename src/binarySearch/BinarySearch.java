package binarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int target=16;
        int index = binarySearch(arr, target);
        System.out.println(index);
    }

    private static int binarySearch(int[] arr, int target) {
        int low=0;
        int high=arr.length-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(arr[mid]==target)
            {
                return mid;
            }else if(arr[mid]<target)
            {
                low=mid++;
            }
            else{
                high=mid--;
            }
        }
        return -1;
    }
}
