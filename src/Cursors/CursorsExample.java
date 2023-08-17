package Cursors;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class CursorsExample {
    public static void main(String[] args) {
        System.out.println("=========================ENUMERATION==============================");
        Vector v=new Vector();
        for(int i=0;i<=10;i++) {
            v.addElement(i);
        }
        System.out.println(v);
        Enumeration e=v.elements();
        while(e.hasMoreElements())
        {
            Integer I=(Integer) e.nextElement();
            if(I%2==0)
            {
                System.out.print(I+" ");
                System.out.println();
            }
        }
        System.out.println(v);
        System.out.println("==========================================================");
        System.out.println("=====================ITERATOR=============================");
        ArrayList<Integer> a=new ArrayList<>();
        for(int i1=0;i1<=10;i1++) {
            a.add(i1);
        }
        System.out.println(v);
        Iterator iterator =a.iterator();
        while(iterator.hasNext())
        {
            Integer I=(Integer) iterator.next();
            if(I%2==0)
            {
                System.out.print(I+" ");
                System.out.println();
            }
            else {
                iterator.remove();
            }
        }
        System.out.println(a);
        System.out.println("==========================================================");
        System.out.println("=====================LIST ITERATOR=============================");
    }
}
