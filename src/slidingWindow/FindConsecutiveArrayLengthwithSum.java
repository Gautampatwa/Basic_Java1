package slidingWindow;

public class FindConsecutiveArrayLengthwithSum {
    public static void main(String[] args) {
        int[] arr={2,5,1,10,10};
        int n=arr.length;
        int k=14;
        int l=0,r=0,sum=0,max=0;
        while (r<n){
            sum=sum+arr[r];
            if(sum>k)
            {
                sum=sum-arr[l];
                l++;
            }
            if(sum<=k)
            {
                max=Math.max(max,r-l+1);
            }
            r=r+1;
        }
        System.out.println(max);
    }
}
