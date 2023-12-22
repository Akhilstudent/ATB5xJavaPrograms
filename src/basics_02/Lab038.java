package src.basics_02;

public class Lab038 {
    public static void main(String[] args) {

        int a = 59;
        int b = 35;
        int c = 98;

        int max = (a > b) ? ((a>c) ? a : c) : ((b > c) ? b : c);
        System.out.println(max);



    }
}
