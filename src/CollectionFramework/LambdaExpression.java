package CollectionFramework;

class Hello {


    static synchronized void Stuff1() {

        for (int i = 1; i <= 10; i++) {
            System.out.println(i * 3);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    static synchronized void Stuff() {

        for (int i = 1; i <= 10; i++) {
            System.out.println(i * 2);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class LambdaExpression {
    public static void main(String[] args) {

        Runnable runnable=Hello::Stuff;
        Thread t=new Thread(runnable);
        t.start();


        Runnable runnable1=Hello::Stuff1;
        Thread t2=new Thread(runnable1);
        t2.start();
    }
}