package oops_Collection_3rd_Feb;

import java.util.HashMap;
import java.util.Map;

public class Lab198 {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("id", 1);
        map.put("id2", 2);
        map.put("id3", 3);
        System.out.println(map);

        System.out.println(map.isEmpty());
        System.out.println(map.containsKey("id3"));
        System.out.println(map.containsValue(2));
        System.out.println(map.get("id3"));
        System.out.println(map.keySet());

        for (Map.Entry<String, Integer> en : map.entrySet()){
            System.out.println(en.getKey() + " --> " + en.getValue());
        }
    }
}
