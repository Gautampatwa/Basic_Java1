package Java8;

interface  A{
    default void print()
    {
        System.out.println("A");
    }
}


interface  B{
     default void print()
    {
        System.out.println("B");
    }
}
public class C implements A,B {
    public static void main(String[] args) {
        new C().print();
        String a="abc";
        String b="ab"+"c";
        System.out.println(a==b);
    }

    @Override
    public void print() {
        A.super.print();
    }
}
