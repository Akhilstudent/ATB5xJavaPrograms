package oops_Collection_21th_Jan;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Lab187 {
    public static void main(String[] args) {

        List<Integer> myMarks = new ArrayList<>();
        myMarks.add(85);
        myMarks.add(75);
        myMarks.add(98);
        Collections.sort(myMarks);
        System.out.println(myMarks);
    }
}
