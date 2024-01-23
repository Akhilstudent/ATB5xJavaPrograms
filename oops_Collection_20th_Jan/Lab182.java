package oops_Collection_20th_Jan;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Lab182 {
    public static void main(String[] args) {

        List<String> mylist = new LinkedList<>();
        mylist.add("Pramod");
        mylist.add("Akhil");
        System.out.println(mylist);


        List<Integer> l = new LinkedList<>();
        l.add(4);
        l.add(8);
        l.add(76);

        Iterator iterator = l.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }



    }
}
