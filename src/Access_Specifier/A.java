package Access_Specifier;
public class A {
    public void myMethod()
    {
        System.out.println("Method");
    }

    {

    }

    public void A()
    {
        System.out.println("Constructor ");
    }
    static {
        System.out.println("static block");
    }
    public static void main(String[] args) {
        A c = new A();
        System.out.println(c);
        c.A();
        c.myMethod();
    }
}