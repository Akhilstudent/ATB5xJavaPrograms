package oops_Collection_20th_Jan;

import java.util.ArrayList;
import java.util.List;

public class Lab179 {
    public static void main(String[] args) {

        List mylist = new ArrayList();
        mylist.add("Pramode");
        mylist.add("Akhil");
        mylist.add(158);
        mylist.add(true);

        System.out.println(mylist);
        mylist.set(1,"Rohit");
        System.out.println(mylist);

        mylist.remove(1);
        System.out.println(mylist);

        for (int i = 0; i < mylist.size(); i++) {
            System.out.println(mylist.get(i));
        }

        for (Object o : mylist){
            System.out.println(o);
        }
    }
}
