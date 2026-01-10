package Java8;

import java.util.HashMap;

public class OccurenceOfEachCharacter {
    public static void main(String[] args) {
        String s = "aabbaaccsadaasdd";
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        for(var e:map.entrySet()){
            if(e.getValue()==2){
                System.out.println(e.getKey()+":"+e.getValue());
            }
        }
    }
}

