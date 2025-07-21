package Stack;

import java.util.Stack;

public class previousSmallerElement {
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
        int[] pse=new int[n];
        pse[0]=-1;
        st.push(arr[0]);
        for(int i=1;i<=n-1;i++)
        {
            while(!st.isEmpty() && st.peek()>=arr[i])
            {
                st.pop();
            }
            if(st.isEmpty())
            {
                pse[i]=-1;
            }
            else{
                pse[i]=st.peek();
            }
            st.push(arr[i]);
        }
       return pse;
    }
}
