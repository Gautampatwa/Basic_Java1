package Arrays;

import java.util.Arrays;

public class RotateArrayByk {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int k=3;
        int index=0;
        int c = 0;
        int[] b=new int[arr.length];
        for(int i=k;i<arr.length;i++)
        {
            b[index++]=arr[i];
        }
        c=index;
        for(int i=0;i<k;i++)
        {
            b[c++]=arr[i];
        }
        System.out.println(Arrays.toString(b));
    }
}
