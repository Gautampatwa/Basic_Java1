package Exceotion;

public class ExceptionHandling {

    public static void main(String[] args) {
        try {
            int a=9;
            int b=0;
            System.out.println(a/b);
        }
        catch (NullPointerException e)
        {
            //e.printStackTrace();
           // System.out.println(e.getMessage());
          //  System.out.println(":"+e.getMessage());
         // System.out.println(e.getClass());
        }
    }
}
