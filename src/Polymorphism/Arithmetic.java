package Polymorphism;
class Add
{
	public int add(int a,int b)
	{
		return a+b;
	}
}
class Sub extends Add
{
	public int sub(int a,int b)
	{
		return a-b;
	}
}


public class Arithmetic {
	public static void main(String[] args) {

//		Add a=new Add();
//		System.out.println(a.add(12, 22));
		Sub b=new Sub();
		System.out.println(b.sub(11, 2));
		System.out.println(b.add(12, 22));
		
	}

}
