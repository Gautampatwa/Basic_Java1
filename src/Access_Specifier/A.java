package Access_Specifier;
public class A {


    public void myMethod()
    {
        System.out.println("111111");
        System.out.println("Mehodooddokdkkd");
    }

    {
        System.out.println("000000000°°°°°°°°°°°°°");
        System.out.println("000000000°°°°°°°°°°°°°");
        System.out.println("000000000°°°°°°°°°°°°°");
        System.out.println(" Instance Block");
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