package Arrays;

import java.util.ArrayList;
import java.util.List;

public class Comparator{

	public static void main(String[] args) {

		List<Student> stud = new ArrayList<Student>();
		stud.add(new Student("Gautam", 1, "Delhi"));
		stud.add(new Student("Mukesh", 21, "Mumbai"));
		stud.add(new Student("Radhey", 9, "Barhalganj"));
		stud.add(new Student("Bhuvan", 13, "Shahjanhan"));
		stud.add(new Student("Makhan", 3, "lucknow"));

		stud.sort(new RollnoComparator());
		for (Student s : stud) {
			System.out.println(s + " ");
		}
		System.out.println();
		System.out.println("Student Details Sort By name");
		System.out.println();
		stud.sort(new NameComparator());
		for (Student s1 : stud) {
			System.out.println(s1 + " ");
		}
		System.out.println();
		stud.sort(new AddressComaparator());
		for (Student s2 : stud) {
			System.out.println(s2 + " ");
		}
	}

}