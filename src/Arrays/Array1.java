package Arrays;

import Access_Specifier.AccessModifiers;
import Interfaces.Interface1;

public class Array1 implements Interface1 {
	public static void main(String[] args)
	{
		final  String RAC="RAC NODE DETAILS";
		Student[] arr =new Student[5];
		arr[0]=new Student("Gautam",1,"Delhi");
		arr[1]=new Student("Shivam",2,"Kolkata");
		arr[2]=new Student("Krishna",3,"Rampur");
		arr[3]=new Student("Mukesh",4,"Lucknow");
		arr[4]=new Student("Gopal",5,"Pilibhit");
		   System.out.println("                  "+"RollNo  "+"Name  "+"Address");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Student details:"+i+"     "+arr[i].getRollno()+"  "+arr[i].getName()+"  "+arr[i].getAddress());
		}
		System.out.println("+============================================================+");

		AccessModifiers accessModifiers=new AccessModifiers();
		accessModifiers.sum();
		System.out.println(accessModifiers.a);
		String s=null;
		String s1=new String("Durga");
		System.out.println(s1.equals(s));
		System.out.println(s);
		System.out.println(null==null);
		System.out.println(s1==s);
		System.out.println(RAC);


	}

	@Override
	public String hello() {
		return "Hello World";
	}
}
