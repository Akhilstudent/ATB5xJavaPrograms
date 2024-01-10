package oops_7th_Dec;

public class Person {
    String name;

    Person(){
        System.out.println("DC");
    }


    Person(String ref_value){
        this.name = ref_value;
        System.out.println("Parametrized Constructor");
    }

    void printDetails(){
        System.out.println("Name --> " + name);
    }
}
