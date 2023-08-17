package Polymorphism;

class A11
{
    public void m1()
    {
        System.out.println("Parent");
    }
}
class B1 extends A11{
    public void m1()
    {
        System.out.println("Child...");
    }
}
 class RuntimePolymorphismwrtvar {
    public static void main(String[] args) {
        A11 a1=new A11();     //Parent
        a1.m1();

        B1 b1=new B1();            //Child
        b1.m1();

        A11 a2= new B1();        //Parent because Method Overloading
        a2.m1();



        // If in class B1 if the parameter is same as A1 class then line 24 Child will be printed because JVM will run it
        // on the base if runtime.....
    }
}
