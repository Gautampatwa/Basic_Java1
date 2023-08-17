package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Array2 {
 
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no to print:");
		int n=sc.nextInt();
		int[] arr =new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=i+1;
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("==============ARRAY LIST=================================");
		ArrayList<Integer> a=new ArrayList<Integer>();
		System.out.println("Enter the size of array:");
		int n1=sc.nextInt();
		for(int i=1;i<=n1;i++)
		{
		a.add(i);	
		}
		System.out.println(a);
		a.forEach(System.out::println);
		Student student=new Student();
		student.setName("Gautam");
		
	
	}
	
	
}
