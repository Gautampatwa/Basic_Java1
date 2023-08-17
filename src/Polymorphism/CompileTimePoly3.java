package Polymorphism;

public class CompileTimePoly3 {

    public void m1(int a)
    {
        System.out.println("Int method...");
    }
    public void m1(int... a)
    {
        System.out.println("Var-arg method...");
    }

    public static void main(String[] args) {
        CompileTimePoly3 compileTimePoly3=new CompileTimePoly3();
        compileTimePoly3.m1();
        compileTimePoly3.m1(10);//here Int method is printed because ... method comes in 1.5v and int was in 1.0v
        compileTimePoly3.m1(1,2);
    }
}
