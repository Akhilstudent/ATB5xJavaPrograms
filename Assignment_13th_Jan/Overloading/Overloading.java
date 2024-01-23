package Assignment_13th_Jan.Overloading;

public class Overloading {
    String name;

    int age;

    public void getInfo(String name, int age){
        System.out.println(name + " " + age);
    }

    public void getInfo(String name){
        System.out.println(name);
    }
    public void getInfo(int age){
        System.out.println(age);
    }


}

