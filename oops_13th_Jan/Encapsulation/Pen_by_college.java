package oops_13th_Jan.Encapsulation;

public class Pen_by_college {
    String type;
    String color;

    public void write(){
        System.out.println("write something");
    }

    public void printColor(){
        System.out.println(this.color);

    }
}
class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student(){
        System.out.println("Default Constructor");
    }
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
}
