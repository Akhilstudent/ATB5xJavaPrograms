package oops_Collection_21th_Jan;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Lab184 {
    public static void main(String[] args) {
        List <String> courselist = new ArrayList<String>();

        courselist.add("ATB");
        courselist.add("MTB");
        courselist.add("Sdet Blueprint");
        courselist.add("LAPIB");

        ListIterator lt = courselist.listIterator(courselist.size());
        while (lt.hasPrevious()){
            System.out.println(lt.previous());
        }

    }
}
