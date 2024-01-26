package oops_Collection_21th_Jan;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab183 {
    public static void main(String[] args) {
        List <String> courselist = new ArrayList<String>();

        courselist.add("ATB");
        courselist.add("MTB");
        courselist.add("Sdet Blueprint");
        courselist.add("LAPIB");

        List numlist = new ArrayList();
        numlist.add(150);
        numlist.add(124);
        numlist.add(135);

        courselist.addAll(numlist);
        System.out.println(courselist);

        Iterator lt = courselist.iterator();
        while (lt.hasNext()){
            System.out.println(lt.next());
        }

    }
}
