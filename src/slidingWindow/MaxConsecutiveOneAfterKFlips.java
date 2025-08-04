package slidingWindow;

public class MaxConsecutiveOneAfterKFlips {
    public static void main(String[] args) {
        int[] arr={1,1,1,0,0,0,1,1,1,1,0};
        int k=2;         //flip the arrays
        int n=arr.length;
        int maxLen=0;
        int len;
        for(int i=0;i<n;i++)
        {
            int zeroes=0;
            for(int j=i;j<n;j++)
            {
                if(arr[j]==0)
                {
                    zeroes++;
                }
                if(zeroes<=k)
                {
                    len=j-i+1;
                    maxLen=Math.max(len,maxLen);
                }
            }
        }
        System.out.println(maxLen);
    }
}
