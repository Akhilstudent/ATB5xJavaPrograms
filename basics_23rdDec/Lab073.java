package basics_23rdDec;

public class Lab073 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Parmod");


//        for ( , , ){
//                System.out.println("TTA");        Infinite loop


            boolean b1 = true;
            b1 = false;
            for (; b1; ) {
                System.out.println("TTA");
            }
        }
    }
}
