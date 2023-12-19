package src.basics_02;

public class Lab030 {
    public static void main(String[] args) {

        int a = 10;
        int b = 30;
        String s1 = "Parmod";
        String s2 = "Kumar";

        System.out.println(a+b+s1+s2);
        System.out.println(s1+s2+a+b);     // ParmodKumar1030
        System.out.println(s1+s2+(a+b));     //BODMAS
    }
}
