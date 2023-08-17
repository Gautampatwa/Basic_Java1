package Day1;
import java.util.Scanner;
public class IfElse {

	public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          int a,b,c;
          a=sc.nextInt();
          b=sc.nextInt();
          c=sc.nextInt();
          if(a>b && a>c)
          {
        	  System.out.println("A is greater:"+a);
          }
          else if(b>a && b>c)
          {
        	  System.out.println("B is greater:"+b);
          }
          else
          {
        	  System.out.println("C is greater:"+c);
          }
		   System.out.println("======================================");
		   System.out.println();
		   int n=sc.nextInt();
		   System.out.println("Entered limit:"+n);
		   
		   int c1=0,c2=0;
		   for(int i=1;i<=n;i++)
		   {
			   if(i%2==0)
			   {
				   c1++;
			   }
			   else
			   {
			    c2++;	   
			   }
		   }
		   System.out.println("No of even number in the limit:"+c1);
		   System.out.println("No of odd number in the limit:"+c2);

		   System.out.println("======================================");
		   
		// TODO Auto-generated method stub

	}

}
