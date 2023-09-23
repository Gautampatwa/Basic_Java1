package Polymorphism;

public class CompileTimePoly2 {
    public void m1(Object o)

    {
        System.out.println("Object Version");
    }
    public void m1(String s)
    {
        System.out.println("String Version");
    }

    public static void main(String[] args) {
        CompileTimePoly2 compileTimePoly2=new CompileTimePoly2();
        compileTimePoly2.m1(new Object());
        compileTimePoly2.m1("Gautam");
        compileTimePoly2.m1(22.2f);
        compileTimePoly2.m1(null);
    }
}
