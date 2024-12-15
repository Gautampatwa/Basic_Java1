package CollectionFramework;

import java.util.*;

public class MapExample {

    public static void main(String[] args) {


        System.out.println("HashMap=========================");
        Map<String,String> map=new HashMap<>();
        map.put("Gautam","Delhi");
        map.put("Mukesh","UP");
        map.put("Suresh","Punjab");
        map.put("Kamla","Kerala");
        map.put("Lucky","GKP");
        System.out.println(map);

        System.out.println("LinkedhashMap=========================");
        Map<String,String> map1=new LinkedHashMap<>();
        map1.put("Gautam","Delhi");
        map1.put("Mukesh","UP");
        map1.put("Suresh","Punjab");
        map1.put("Kamla","Kerala");
        map1.put("Lucky","GKP");
        System.out.println(map1);

        System.out.println("TreeMap=========================");
        Map<String,String> map2=new TreeMap<>();
        map2.put("Gautam","Delhi");
        map2.put("Mukesh","UP");
        map2.put("Suresh","Punjab");
        map2.put("Kamla","Kerala");
        map2.put("Kamla","Kataria");
        map2.put("Lucky","GKP");
        System.out.println(map2);
        for(var e:map2.entrySet())
        {
            System.out.println(e.getKey()+":"+e.getValue());
        }
        System.out.println(map2.get("Gautam"));
        System.out.println(map2.size());
        System.out.println("===============================================");

        Map<String, List<String>> map3=new LinkedHashMap<>();
        map3.put("ate",Arrays.asList("tea","ate","eta"));
        map3.put("toy",Arrays.asList("txm","amd","lkf"));
        map3.put("mag",Arrays.asList("ryu","bsg","jqj"));
        map3.put("pok",Arrays.asList("rii","wje","ouy"));
        map3.put("ois",Arrays.asList("tks","ajjd","eiu"));
        for(var e:map3.entrySet())
        {
            System.out.println(e.getKey()+":"+e.getValue());
        }
        List<String> oisList = map3.get("ois");
        System.out.println(oisList);
        if (oisList != null) {
            oisList.add("sss");  // Add "sss" to the list
        }

        // Print the updated contents of the map
        System.out.println("Updated map:");
        for (var e : map3.entrySet()) {
            System.out.println(e.getKey() + ":" + e.getValue());
        }
    }
}
