package Day1;
import java.util.*;
import java.io.*;


public class ArrayList1 {

	public static void main(String[] args) {
		System.out.println("=============ArrayList=================");
		ArrayList<Integer> a1=new ArrayList<>();
		for(int i=1;i<10;i++)
		
		a1.add(i);
		System.out.println(a1);
		
		System.out.println("==========Hash Map======================");
		HashMap<Integer,String> h=new HashMap<Integer,String>();
		h.put(1,"Gautam");
		h.put(2,"Shivam");
		h.put(3, "Shivam");
		// TODO Auto-generated method stub
		System.out.println(h);
		h.remove(2);
		System.out.println(h.toString());
		for(Map.Entry<Integer, String> e: h.entrySet())
		{
			System.out.println(e.getKey()+" "+e.getValue());
		}

		System.out.println("=======================================");
		Set<String> strings=new HashSet<>();
		strings.add("Gautam");
		strings.add("Gautam");
		strings.add("Satyam");
		strings.add("Mukesh");
		strings.add("Kuldeep");
		strings.add("Pankaj");
		System.out.println(strings);
	}

}
