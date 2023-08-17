package ExceptionHandling;

import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;

public class Exception1 {
    private static final Logger LOGGER= LoggerFactory.getLogger(Exception1.class);
	public static void main() throws Exception {
		
		try
		{
			
		int a=10;
		int b=0;
		int c=a/b;
		System.out.println("Result:"+c);
		}

		catch(Exception e)
		{
//			int age = 89;
//			if(age<18)
//			{
//				throw new Exception("Age should be greater than 18");
//			}
			LOGGER.error(new Throwable("Failed"),() -> e.getLocalizedMessage());
			e.printStackTrace();
			System.out.println(e);
			System.out.println("Arithemetic Exception");
		}
		finally
        {
        	System.out.println("Try Catch finished");
        }
	}

}
