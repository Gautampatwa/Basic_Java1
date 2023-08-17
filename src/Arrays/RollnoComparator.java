package Arrays;

import java.util.Comparator;
public class RollnoComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getRollno()-o2.getRollno();
	}
	

}
