package Polymorphism;

public class CompileTime {
	
	public int add(int a,float b)
	{
		return (int) (a+b);
	}
	public int add(float a,int b)
	{
		return (int) (a+b);
	}
	
	public static void main(String[] args)
	{
		CompileTime c=new CompileTime();
		System.out.println(c.add(12, 2.2f));
		System.out.println(c.add(2.2f, 22));
//		System.out.println(c.add(10,20));
		System.out.println(1);
	}

}
