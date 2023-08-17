package Polymorphism;

public class ComplieTimePoly1 {
    public void m1(int a)
    {
        System.out.println("Int arg method");
    }
    public void m1(String b)
    {
        System.out.println("String arg");
    }

    public static void main(String[] args) {
        ComplieTimePoly1 complieTimePoly1=new ComplieTimePoly1();
        complieTimePoly1.m1(2);
        complieTimePoly1.m1("Hello");
        complieTimePoly1.m1('a');
        complieTimePoly1.m1(null);
    }
}
