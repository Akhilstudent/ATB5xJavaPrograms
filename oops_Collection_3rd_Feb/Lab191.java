package oops_Collection_3rd_Feb;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Lab191 {
    public static void main(String[] args) {

        Set courseName = new HashSet();
        courseName.add("ATB");
        courseName.add("Automation");
        courseName.add("Selenium");
        courseName.add("SDET Blueprint");

        for ( Object o : courseName) {
            System.out.println(o);
        }

        System.out.println("------------------");

        Iterator iterator = courseName.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
