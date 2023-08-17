package Inheritance;

class Parent1 {

	public void show()
	{
		System.out.println("In Parent");
	}
}
class Child1 extends Parent1
{
	public void show1()
	{
		System.out.println("In child");
	}
}
class Child2 extends Child1
{
	public void show2()
	{
		System.out.println("In Subchild");
	}
}
public class Inheritance1{
	public static void main(String[] args)
	{
		Child2 c=new Child2();
		Child1 child1=new Child1();
		c.show();
		c.show1();
		c.show2();
		child1.show();
		child1.show1();
		}
}
