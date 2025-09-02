package HAsHING;

import java.util.*;

public class HAshing3 {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("India", 120);
        map.put("US", 30);
        map.put("China", 150);

        System.out.println(map);

        map.put("China",110);
        System.out.println(map);

        if(map.containsKey("China")){
            System.out.println("Key is present in the map");
        }
        else{
            System.out.println("Key is not present in the map");
        }

        System.out.println(map.get("India"));
        System.out.println(map.get("Indonesia"));

        for (Map.Entry<String, Integer> e : map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());

            Set<String> keys = map.keySet();
            for (String key: keys){
                System.out.println(key+ " "  + map.get(key));
            }
        }

    }
}
