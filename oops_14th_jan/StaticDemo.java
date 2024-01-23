package oops_14th_jan;

public class StaticDemo {
    public static String college_name = "The Testing Academy";
    public int version = 3;

    public static void printName(){
        System.out.println("Name is " + college_name);
    }

    public void printVersion(){
        System.out.println("Version is " + version);
        System.out.println("Name is " + college_name);
    }
}
