package Arrays;

import Polymorphism.Arithmetic;

import javax.security.auth.Subject;

public class MethodExample {
    public static void show() {
        System.out.println("Show Method called");
    }

    public static void show1() {
        System.out.println("Show1 Method called");
    }

    public static void show2() {
        System.out.println("Show2 Method called");
    }

    public static void show3() {
        System.out.println("Show3 Method called");
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        MethodExample.show();
        MethodExample.show1();
        MethodExample.show2();
        MethodExample.show3();
        Student student = new Student();
        student.setName("Rahul");
        System.out.println(student.getName());
        MethodExample methodExample = new MethodExample();
        System.out.println(methodExample.add(12, 33));
        System.out.println(methodExample.sub(123, 22));
        Subject subject = new Subject();
        System.out.println(subject.getPrincipals().hashCode());


    }
}
