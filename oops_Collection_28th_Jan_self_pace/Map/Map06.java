package oops_Collection_28th_Jan_self_pace.Map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Map06 {
    public static void main(String[] args) {
        Map m = new TreeMap<>();
        m.put("name","Pramod");
        m.put("age","34");
        //m.put(24,127);
        System.out.println(m);

        Map m1 = new LinkedHashMap();
        m1.put("name","Pramod");
        m1.put("age","34");
        m1.put(24,127);
        System.out.println(m1);




    }
}
