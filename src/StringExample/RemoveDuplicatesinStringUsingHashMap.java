package StringExample;

import java.util.*;

public class RemoveDuplicatesinStringUsingHashMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String to remove duplicate characters:");
        String input1 = scanner.nextLine();
        char[] s=input1.toCharArray();
        removeDuplicates(s);

    }

    private static void removeDuplicates(char[] s) {
        List<Character>  list =new ArrayList<>();
        StringBuilder s1=new StringBuilder();
        Map<Character,Integer> map=new HashMap<>();

        for(char c:s) {
            if (!map.containsKey(c))
            {
                s1.append(c);
                list.add(c);
                map.put(c,1);
            }
        }
        System.out.println(s1);
        System.out.println(list);
    }
}
