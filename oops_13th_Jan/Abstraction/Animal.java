package oops_13th_Jan.Abstraction;

abstract class Animal {
    abstract void walk();
}

class Hourse extends Animal{
    public void walk(){
        System.out.println("Walk on 4 legs");
    }
    }
class Chicken extends Animal{
    public void walk(){
        System.out.println("Walk on 2 legs");
    }
}

