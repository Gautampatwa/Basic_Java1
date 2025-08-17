package Arrays;

public class SortZeroOneTwo {
    public static void main(String[] args) {
        int[] arr={0,0,1,0,1,0,2,0,1,1,2,2,2,0,1,0};
        int countZero=0;
        int countOne=0;
        for (int j : arr) {
            if (j == 0) {
                countZero++;
            }
        }
        for (int j : arr) {
            if (j == 1) {
                countOne++;
            }
        }
        int index=0;
        for(int i=0;i<countZero;i++)
        {
            arr[index++]=0;
        }
        int onecount=countOne+countZero;
        for(int i=countZero;i<onecount;i++)
        {
            arr[index++]=1;
        }
        int twoScount=countOne+countZero;
        for(int i=twoScount;i<arr.length;i++)
        {
            arr[index++]=2;
        }
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
    }
}
