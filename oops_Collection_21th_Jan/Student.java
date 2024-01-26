package oops_Collection_21th_Jan;


import java.util.Comparator;

class  Asc implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getId(), o2.getId());
    }
}

class SortByName implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
public class Student implements Comparable<Student> {
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Integer id;
    String name;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Student(Integer id, String name) {
        this.id = id;
        this.name = name;
    }


    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.id, o.id);
    }
}
