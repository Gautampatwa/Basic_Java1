package Multithreading;

public class OrderedThreadPrinting {

    private static final Object lock = new Object();
    private static int turn = 1;

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> printNumbers(1, 10, 1));
        Thread t2 = new Thread(() -> printNumbers(2, 11, 2));
        Thread t3 = new Thread(() -> printNumbers(3, 9, 3));

        t1.start();
        t2.start();
        t3.start();
    }

    private static void printNumbers(int start, int end, int threadId) {
        for (int i = start; i <= end; i += 3) {
            synchronized (lock) {
                while (turn != threadId) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
                System.out.println("t" + threadId + " - " + i);
                turn = threadId % 3 + 1; // rotate turn: 1 → 2 → 3 → 1 ...
                lock.notifyAll();
            }
        }
    }
}
