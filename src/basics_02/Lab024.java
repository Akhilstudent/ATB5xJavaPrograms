package src.basics_02;

public class Lab024 {
    public static void main(String[] args) {

        int a = 15;
        boolean b = !(a > 10 || a < 5);
        System.out.println(b);

        boolean b1 = a > 12 && a < 10;
        System.out.println(b1);
    }
}
