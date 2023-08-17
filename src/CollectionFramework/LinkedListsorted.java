package CollectionFramework;

import java.util.*;
import java.util.stream.Collectors;

class LinkedListsorted {
    public static void main(String[] args) {
        System.out.println("========================ARRAYLIST=====================");
        ArrayList<String> str = new ArrayList<>();
        str.add("Mukesh");
        str.add("Rakesh");
        str.add("Gautam");
        str.add("Shiva");
        System.out.println(str);
        System.out.println(str.add("Satya"));
        System.out.println(str.add("Shiva"));
        System.out.println(str);
        System.out.println("String:" + str.get(1));
        //str.remove(4);
        str.forEach(System.out::println);
        System.out.println(str.size());
        System.out.println("====================================VECTOR=============================");
        Vector v = new Vector();
        v.addAll(str);
        v.add(2, 22);
        v.add(3, 21);
        System.out.println(v);
        v.forEach(System.out::println);

        System.out.println("===========================ArrayList===================================");
        List<Integer> integers=Arrays.asList(21,32,3,53,22,22,2,1,111);
        System.out.println(integers);
        System.out.println(integers.stream().map(n->n%2==0).collect(Collectors.toList()));


        System.out.println("===========================FOREACHLOOP================================");
        for (String s1 : str) {
            System.out.println(s1);
        }
        System.out.println("============================LINKED LIST======================================");
        List lis = new LinkedList();
        lis.add(1);
        lis.add("Munna");
        lis.add("Shivam");
        lis.add(112.6);
        lis.add(112.6);
        System.out.println(lis);
        lis.forEach(System.out::println);
        System.out.println(str.equals(str));


        System.out.println("=============================HASHSET============================================");
        Set<String> str1 = new HashSet<>();
        str1.addAll(str);
        System.out.println(str1.add("Satyam"));

        System.out.println(str1);
        str1.forEach(e -> System.out.println(e));


        System.out.println("============================TREESET============================");

        TreeSet<String> st = new TreeSet<>();
        st.addAll(str);
        System.out.println(st);
        st.forEach(System.out::println);


        System.out.println("============================USINGFOREACHLOOP===========================");
        for (String s : st) {
            System.out.println(s + " " + s.length());

            StringBuffer br = new StringBuffer(s);
            System.out.println(br.reverse());
        }

        System.out.println("===========================HASHMap=============================");
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Gautam", 9936);
        map.put("Mukesh", 2727);
        map.put("Lalu", 8828);
        map.put("Mustaq", 8831);
        map.put("Mustaq",8831);
        map.put("Edward", 1182);
        System.out.println(map);
        Collection s = map.keySet();
        System.out.println(s);
        Collection c = map.values();
        System.out.println(c);
        System.out.println(map.put("Mukesh", 2727));
        System.out.println(map.get("Gautam"));
        System.out.println(map.get("Mustaq"));
        map.forEach((e1, e2) -> {
            System.out.println(e1 + ":" + e2);
        });
        System.out.println("==================================HASHTABLE===============================");
        Hashtable hashtable = new Hashtable();
        hashtable.put(new Temp(5), "A");
        hashtable.put(new Temp(2), "B");
        hashtable.put(new Temp(6), "C");
        hashtable.put(new Temp(15), "D");
        hashtable.put(new Temp(23), "E");
        hashtable.put(new Temp(16), "F");

        System.out.println(hashtable);
        hashtable.forEach((e1,e2)->{
            System.out.println(e1+":"+e2);
        });


        LinkedListsorted linkedListsorted =new LinkedListsorted();
        System.out.println(linkedListsorted.fun());
    }

    int fun()
    {
        return 20;
    }

}

class Temp {

    int i;

    Temp(int i) {
        this.i = i;
    }

    public int hashCode() {
        return i;
    }

    public String toString() {
        return i + " ";
    }
}