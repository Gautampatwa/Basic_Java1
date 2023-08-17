package Loop;

import java.util.Scanner;

public class While {
	
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n!=0)
		{
			n=n+2;
			if(n==100)
				break;
	
			System.out.println(n);
		}
		
		System.out.println("================");
		System.out.println(Math.max(111,1111));

		System.out.println(Math.min(111,1111));

		System.out.println(Math.sqrt(64));

		System.out.println(Math.random());
		
	}

}
