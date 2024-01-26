package oops_Collection_21th_Jan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab189 {
    public static void main(String[] args) {

//        List myMarks = new ArrayList<>();
//        myMarks.add(59);
//        myMarks.add(85);
//        myMarks.add(49);
//        Collections.sort(myMarks);
//        System.out.println(myMarks);

        Student student = new Student(1, "Lucky");
        Student student2 = new Student(10, "Pramod");
        Student student3 = new Student(3, "Akhil");

        List <Student> students = new ArrayList<>();
        students.add(student);
        students.add(student2);
        students.add(student3);
       // System.out.println(students);

//        Collections.sort(students);
//        System.out.println(students);

        Collections.sort(students, new SortByName());
        System.out.println(students);
    }
}
