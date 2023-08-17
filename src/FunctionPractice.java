public class FunctionPractice {
    static int a1=22;
    int a2=44;
    public static void hello()
    {
        System.out.println("Hello Gautam");
        add(2,2);
    }
    public static int add(int a, int b)
    {
        System.out.println("Static int:"+a1);
        System.out.println(a+b);
        return a+b;
    }

    public int sub(int a, int b)
    {
        System.out.println("Static int:"+a1);
        System.out.println("Local:"+a2);
        System.out.println(a-b);
        return a-b;
    }

    public int mul(int a, int b)
    {
        System.out.println(a*b);
        return a*b;
    }

    public int div(int a, int b)
    {
        System.out.println(a/b);
        return a/b;
    }
    public static void main(String[] args) {
        hello();
        FunctionPractice functionPractice=new FunctionPractice();
        functionPractice.add(11,22);
        functionPractice.sub(11,2);
        functionPractice.mul(22,23);
        functionPractice.div(12,2);
    }
}
