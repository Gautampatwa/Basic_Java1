package Multithreading;



class Bthread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Thread B: " + i);
            try {
                Thread.sleep(500); // Simulate some work with a delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}