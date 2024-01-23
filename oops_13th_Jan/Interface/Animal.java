package oops_13th_Jan.Interface;

interface Animal {
    int eye = 2;
    void walk();
}
interface Herbivore{

}
class Horse implements Animal, Herbivore{
    public void walk(){
        System.out.println("Walks on 4 legs");
    }
}
