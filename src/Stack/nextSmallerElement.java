package Stack;

import java.util.Stack;

public class nextSmallerElement {
    public static void main(String[] args) {
        int[] arr={5,2,4,6,3,5};
        int[] ints = nextSmaller(arr);
        for(int i:ints)
        {
            System.out.print(i+" ");
        }
    }

    private static int[] nextSmaller(int[] arr) {
        int n=arr.length;
        Stack<Integer> st=new Stack<>();
        int[] nse=new int[n];
        st.push(n-1);
        nse[n-1]=n;
        for(int i=n-2;i>=0;i--)
        {
            while(!st.isEmpty() && arr[st.peek()]>=arr[i])
            {
                st.pop();
            }
            if(st.isEmpty())
            {
                nse[i]=n;
            }
            else{
                nse[i]=st.peek();
            }
            st.push(i);
        }
       return nse;
    }
}
