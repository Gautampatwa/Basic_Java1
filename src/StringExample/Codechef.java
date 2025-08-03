package StringExample;import java.util.*;
import java.lang.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            Map<Integer,Integer> map=new HashMap<>();
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            List<Object> list=new ArrayList<>();
            for(int i:arr)
            {
                if(!map.containsKey(i))
                {
                    list.add(i);
                    map.put(i,1);
                }
            }
            System.out.println(list.size());
            for(Object j:list)
            {
                System.out.print(j+" ");
            }
        }
    }
}
