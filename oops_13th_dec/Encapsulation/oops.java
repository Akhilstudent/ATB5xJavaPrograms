package oops_13th_dec.Encapsulation;

public class oops {
    public static void main(String[] args) {
//        Pen_by_college pen = new Pen_by_college();
//        pen.color = "Blue";
//        pen.type = "Ball";
//
//        pen.write();
//        pen.printColor();

        Student s1 = new Student();
        s1.name = "Akhil";
        s1.age = 19;
        s1.printInfo();

        Student s2 = new Student("Pramod", 28);
        s2.printInfo();
    }





}


