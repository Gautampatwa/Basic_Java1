package ExceptionHandling;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exception1Test {
    Exception1 exception1=new Exception1();
    @Test
    void main() throws Exception {
        exception1.equals(Exception1.class);
        assertNotNull(exception1);
        int a=9;
        int b=7;
        int c=a/b;
        assertEquals(1,exception1.toString());
    }

    @Test//(expected=NullPointerException.class)
    public void test()
    {

    }
}