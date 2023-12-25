package src.basics_02;

public class Lab062 {

    public static void main(String[] args) {

        // Run only after 12 jdk. Not in 12
        int itemcode = 002;

        switch (itemcode){
            case 001, 002, 003:
                System.out.println("Match 2");
            case 004, 005:
                System.out.println("Match 5");
            default:
                System.out.println("Not match");
        }
    }
}
