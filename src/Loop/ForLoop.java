package Loop;

import Arrays.Student;

import java.util.Scanner;

public class ForLoop {
	public static void main(String[] args) {
		Student s=new Student();
		System.out.println("Welcome to Loop");
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number:");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
			System.out.print(i);
		    }
			System.out.println();
			
		}
		System.out.println("=================================");
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
			System.out.print(j);
		    }
			System.out.println();
			
		}
		System.out.println("===============================");
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
			System.out.print(i);
		    }
			System.out.println();
			
		}
		System.out.println("===============================");
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
			System.out.print(j);
		    }
			System.out.println();
			
		}
		
		
		
	}

}
