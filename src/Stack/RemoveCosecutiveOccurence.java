package Stack;

import java.util.Arrays;
import java.util.Stack;

public class RemoveCosecutiveOccurence {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,10,10,10,5,7,7,2};
        int[] removed = remove(arr);
        System.out.println(Arrays.toString(removed));
    }

    private static int[] remove(int[] arr) {

        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(st.isEmpty() || st.peek()!=arr[i])
            {
                st.push(arr[i]);
            }
            else if(st.peek()==arr[i])
            {
                if( arr[i]!=arr[i+1])
                {
                    st.pop();
                }
            }
        }
        int[] res=new int[st.size()];
        int m=res.length;
        for(int i=m-1;i>=0;i--)
        {
            res[i]=st.pop();
        }
        return res;
    }
}
