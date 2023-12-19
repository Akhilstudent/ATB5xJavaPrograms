package src.basics_02;

public class Lab018 {
    public static void main(String[] args) {
        int a = 10;
        int b = 45;
        System.out.println(a+b);

        String name = "Parmod";
        System.out.println(a+name);
        System.out.println(name+b);

        // Interview ->  Left to right
        //  Concatination --> String + other

        System.out.println(a+b+name);     //   55Parmod
        System.out.println(name+a+b);      // (name+a= con.) the con.+b
    }
}
