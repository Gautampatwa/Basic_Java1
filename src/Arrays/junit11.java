package Arrays;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class junit11 {

	private Student stud=new Student();
	
	@Test
	@Before
	public void test()
	{
		System.out.println("Before Annotation Called");
       String exp="Ram";
       String act=stud.setName("Ram");
       assertEquals(act,exp);
       }
	
	@Test
	@AfterEach
	void test1()
	{
		System.out.println("AfterEach called");
		String act="Radhey";
		String exp=stud.setName("Radhey");
		assertEquals(act,exp);
	}
    @Test
	@AfterClass
	void test3()
	{
		System.out.println("AfterClass Called");
	}
	@Test
	void test2()
	{
		System.out.println("Test 2");
		String act="Delhi";
		String exp=stud.setAddress("Delhi");
		assertEquals(act,exp);
	}


}
