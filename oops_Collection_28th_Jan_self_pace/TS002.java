package oops_Collection_28th_Jan_self_pace;

import java.util.Comparator;
import java.util.TreeSet;

class Student2{
    private int id;
    private String name;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student2(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}

class SortByID implements Comparator<Student2>{

    @Override
    public int compare(Student2 o1, Student2 o2) {
        return Integer.compare(o1.getId(), o2.getId());
    }
}
class SortByName implements Comparator<Student2>{


    @Override
    public int compare(Student2 o1, Student2 o2) {
        return o1.getName().compareTo(o2.getName());
    }
}









public class TS002 {
    public static void main(String[] args) {

        //TreeSet <Student2> student2set = new TreeSet<>(new SortByName());
        TreeSet<Student2> student2set = new TreeSet<>(new SortByID());
        student2set.add(new Student2(101,"Pramod", 28));
        student2set.add(new Student2(103,"Akhil", 24));
        student2set.add(new Student2(102,"Bob",34));

        for (Student2 student2: student2set){
            System.out.println(student2);
        }
    }
}
