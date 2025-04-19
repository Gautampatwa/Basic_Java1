package CollectionFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] arr = s.toCharArray();
        removeDuplicates(arr);
    }

    private static void removeDuplicates(char[] arr) {

        Map<Character, Integer> map = new HashMap<>();
        StringBuilder builder=new StringBuilder();

        for (char c : arr) {
            if (!map.containsKey(c))
            {
                builder.append(c);
                map.put(c,1);
            }
        }
        System.out.println(builder);
    }

}
