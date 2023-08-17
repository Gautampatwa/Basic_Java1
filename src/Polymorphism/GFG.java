package Polymorphism;
//Java program to demonstrate
//runtime polymorphism

class Test {

	// Implementing a method
	public void method()
	{
		System.out.println("Method 1");
	}
}

//Defining a child classclass
class GFG1 extends Test {

	// Overriding the parent method

	public void method()
	{
		// \u000d System.out.println("Method 2");
	}
}
public class GFG	// Driver code
{
public static void main(String args[])
	{
		Test test1 = new GFG1();
		Test test2 = new Test();
        test2.method();
		test1.method();
	}


}