package Java8;

interface I {
    default void m1() {
        System.out.println("Default Interface called");
    }
}

public class DefaultMethod implements I {
    public static void main(String[] args) {
        DefaultMethod defaultMethod=new DefaultMethod();
        defaultMethod.m1();
    }
}
