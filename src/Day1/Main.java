package Day1;

import Arrays.Student;

public class Main {

	public static void main(String[] args) {
		
		Student s=new Student();
		System.out.println(s.getAge());;
		s.setAge(30);
		System.out.println(s.getAge());
		System.out.println(s.getName());
		s.setName("Gautam");
		System.out.println(s.getName());
		
		
	}

}
