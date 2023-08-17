package Arrays;

public class Thread2 extends Thread {

    public void run()
    {
        System.out.println("Thread2 "+Thread.currentThread().getId()+" is called");
    }
}
