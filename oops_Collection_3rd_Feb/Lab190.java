package oops_Collection_3rd_Feb;

import javax.print.attribute.standard.OrientationRequested;
import java.util.HashSet;
import java.util.Set;

public class Lab190 {
    public static void main(String[] args) {

        Set fruits = new HashSet();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add("Watermelon");

        System.out.println(fruits);
        fruits.isEmpty();
        System.out.println(fruits.isEmpty());
        System.out.println(fruits.size());
        System.out.println(fruits.contains("Orange"));
    }
}
