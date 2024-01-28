package oops_Collection_28th_Jan_self_pace.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Map03 {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1,"Akhil");
        map.put(2,"Pramod");
        map.put(3,"Lucky");
        map.put(4,"Bob");
        map.put(5,"Alis");
        System.out.println(map);

        map.put(null, "Copy");
        System.out.println(map);

        System.out.println(map.get(4));

        for (Map.Entry<Integer, String> e : map.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue());
        }



    }
}
