package Multithreading;

import Arrays.Student;

public class Thread1 extends Thread {

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Child Thread " + i);
        }
    }

    public void run(int i) {
        for (int j = 0; j < 10; j++) {
            System.out.println("Hello Gautam "+j);
        }
    }
}
