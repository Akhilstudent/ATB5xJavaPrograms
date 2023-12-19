package src.basics_02;

public class Lab027 {
    public static void main(String[] args) {

        // Casting --> Mold
        byte b = 10;
        int a = b;   // Implicit Casting done by JVM   like as int a = (int)b; <-- this is explicit



//        int b = 10;
//        byte a = b;    this is invalid

        int a1 = 200;
        byte b1 = (byte)a1;    // It is Explicit Casting
        System.out.println(b1);


    }
}
