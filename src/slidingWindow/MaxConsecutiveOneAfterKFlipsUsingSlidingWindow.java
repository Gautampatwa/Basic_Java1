package slidingWindow;

public class MaxConsecutiveOneAfterKFlipsUsingSlidingWindow {
    public static void main(String[] args) {
        int[] arr={1,1,1,0,0,0,1,1,1,1,0};
        int k=2;         //flip the arrays
        int n=arr.length;
        int l=0,r=0,zeroes=0,maxLen=0,len;
        while(r<n)
        {
            if(arr[r]==0)
            {
                zeroes++;
            }
            if(zeroes>k)
            {
                if(arr[l]==0)
                {
                    zeroes--;
                }
                l++;
            }

            if(zeroes<=k)
            {
                len=r-l+1;
                maxLen=Math.max(maxLen,len);
            }
            r++;
        }
        System.out.println(maxLen);
    }
}
