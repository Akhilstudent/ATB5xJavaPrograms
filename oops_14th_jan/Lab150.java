package oops_14th_jan;

public class Lab150 {
    public static void main(String[] args) {

        System.out.println(StaticDemo.college_name);
        StaticDemo.printName();

        StaticDemo s1 = new StaticDemo();
        s1.printVersion();

        StaticDemo s2 = new StaticDemo();
        s2.version = 199;
        s2.printVersion();
    }
}
