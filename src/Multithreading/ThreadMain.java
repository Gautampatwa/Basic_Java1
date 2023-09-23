package Multithreading;

public class ThreadMain {
    public static void main(String[] args) {
        Thread1 thread1=new Thread1();
//        thread1.start();
        thread1.run();

        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i <10; i++) {
            System.out.println("Parent Thread "+i);
        }
    }
}
