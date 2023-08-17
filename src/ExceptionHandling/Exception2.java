package ExceptionHandling;

import org.junit.platform.commons.logging.LoggerFactory;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Exception2 {
	public static void main(String[] args) throws Exception{


		final Logger LOGGER =
				Logger.getLogger(String.valueOf(Exception2.class)) ;
		try {
			int a=3;
			int b=0;
			int c=a/b;
			System.out.println("Welcome"+c);
			System.exit(3);
		}
		catch(Exception e)
		{
		//	e.printStackTrace();
			int age=60;
			if(age<18)
			{
				throw new Exception("Age should be 18");
			}
			LOGGER.log(Level.INFO, "Welcome to Edureka!");

			System.out.println("=======Terminated========");
		}
		finally {
			System.out.println("Exception Caught");

		}
	}
	

}
