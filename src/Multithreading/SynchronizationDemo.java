package Multithreading;

class Display {
    public synchronized void wish(String name) {
        for (int i = 0; i < 10; i++) {
            System.out.print("Good Afternoon:");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }
            System.out.println(name);
        }
    }
}

class Mythread extends Thread {
    Display d;
    String name;

    Mythread(Display d, String name) {
        this.name = name;
        this.d = d;
    }

    public void run() {
        d.wish(name);
    }
}

public class SynchronizationDemo {
    public static void main(String[] args) {
        Display d = new Display();
        Mythread t1 = new Mythread(d, "Dhoni");
        Mythread t2 = new Mythread(d, "Yuvraj");
        t1.start();
        System.out.println(Thread.currentThread().getName());
        t2.start();
    }
}
