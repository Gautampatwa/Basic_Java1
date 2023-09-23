package Recursion;

public class BinarySearchUsingRecursion2 {
    public static void main(String[] args) {

        int arr[]={2,3,4,6,83,93,102,121,213,311};
        int target=311;
        System.out.println(search(arr,0,arr.length-1,target));
    }

    private static int search(int[] arr, int low, int high, int target) {
        int mid=low+(high-low)/2;
        if(low>mid)
        {
            return -1;
        }
        if(arr[mid]==target) {
            return mid;

        }
        if(target<arr[mid])
        {
           return search(arr,low,mid-1,target);
        }
        else {
           return search(arr,mid+1,high,target);
        }
    }
}
