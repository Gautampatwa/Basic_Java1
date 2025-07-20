package Stack;

import Arrays.Arrays;

public class nextGreaterUsingArray {
    public static void main(String[] args) {
        int[] arr={1,3,8,23,3,91,52,21,23,12};
        int[] greaterEle = nextGreaterEle(arr);
        for(int e:greaterEle)
        {
            System.out.print(e+" ");
        }
    }

    private static int[] nextGreaterEle(int[] arr) {

        int[] res=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            res[i]=-1;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]>arr[i])
                {
                    res[i]=arr[j];
                    break;
                }
            }
        }
        return res;
    }
}
