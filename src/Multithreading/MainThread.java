package Multithreading;


public class MainThread {
    public static void main(String[] args) throws InterruptedException {
        Athread t1 = new Athread();
        Bthread t2 = new Bthread();

        t1.start();
        t1.join();

        t2.start();
        t2.join();
    }
}
