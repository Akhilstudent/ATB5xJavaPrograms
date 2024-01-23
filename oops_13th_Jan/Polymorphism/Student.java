package oops_13th_Jan.Polymorphism;

public class Student {
    //overloading
    String name;
    int age;

    public void inPr(String name){
        System.out.println(name);
    }

    public void inPr(String name, int age){
        System.out.println(name + " " + age);
    }

    public void inPr(int age){
        System.out.println(age);
    }

}
