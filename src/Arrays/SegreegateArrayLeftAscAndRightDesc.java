package Arrays;

public class SegreegateArrayLeftAscAndRightDesc {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int n1=arr.length;
        int midIndex = (n1 - 1) / 2;
        divide(arr, 0, midIndex, true);

        divide(arr, midIndex + 1, n1 - 1, false);
        for(int num:arr)
        {
            System.out.print(num+" ");
        }
    }

    private static void divide(int[] arr, int m, int n,boolean flag) {
        if(m>=n)
        {
            return;
        }
        int mid=m+(n-m)/2;
        divide(arr, m, mid, flag);
        divide(arr, mid + 1, n, flag);
        conquer(arr,m,mid,n,flag);
    }

    private static void conquer(int[] arr, int m, int mid, int n,boolean flag) {
        int[] merged=new int[n-m+1];
        int index1=m;
        int index2=mid+1;
        int x=0;

        if(flag) {
            while (index1 <= mid && index2 <= n) {
                if (arr[index1] <= arr[index2]) {
                    merged[x++] = arr[index1++];
                } else {
                    merged[x++] = arr[index2++];
                }
            }
        }else{
            while (index1 <= mid && index2 <= n) {
                if (arr[index1] >= arr[index2]) {
                    merged[x++] = arr[index1++];
                } else {
                    merged[x++] = arr[index2++];
                }
            }
        }
        while (index1<=mid)
        {
            merged[x++]=arr[index1++];
        }

        while (index2<=n)
        {
            merged[x++]=arr[index2++];
        }
        for(int i=0,j=m;i<merged.length;i++,j++)
        {
            arr[j]=merged[i];
        }
    }
}
