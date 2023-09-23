package LinkedList;

import java.util.LinkedList;

public class LL {

    public static void main(String[] args) {
        LinkedList<String> strings=new LinkedList<>();
        strings.addFirst("Gautam");
        strings.add("Mukesh");
        strings.addLast("Govind");
        strings.addFirst("Amit");
        System.out.println(strings);

        for(int i=0;i<strings.size();i++)
        {
            System.out.print(strings.get(i)+"->");
        }
        System.out.println("null");
        strings.removeLast();

        for(int i=0;i<strings.size();i++)
        {
            System.out.print(strings.get(i)+"->");
        }
        System.out.println("null");

    }
}
