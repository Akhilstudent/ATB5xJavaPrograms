package oops_Collection_28th_Jan_self_pace.Map;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;

public class Hashtable01 {
    public static void main(String[] args) {

        Hashtable<Integer, String> ht01 = new Hashtable<>();
        ht01.put(1, "One");
        ht01.put(2, "Two");
        ht01.put(3, "Three");

        Enumeration<Integer> e = ht01.keys();

        for (Map.Entry e1 : ht01.entrySet()){
            System.out.println("Rank " + e1.getKey() + "\t Name : " + e1.getValue());
        }
    }
}
