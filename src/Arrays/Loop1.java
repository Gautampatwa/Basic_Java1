package Arrays;

public class Loop1 {
    public static void main(String[] args) throws InterruptedException {


        for(int i=1;i<=100;i++)
        {
            Thread thread=new Thread();
            System.out.println("I Love you:"+i);
            if(i==50)
            {
                thread.sleep(50);
                System.out.println("I love you so much:");
            }
            thread.sleep(60);

        }
    }
}
