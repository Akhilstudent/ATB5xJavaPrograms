package src.basics_02;

public class Lab021 {
    public static void main(String[] args) {

        // Interview question - Relational Operator
        System.out.println( 10 == 10);
        System.out.println( 10 >=10);
        System.out.println(12<=10);
        System.out.println("--------");

        System.out.println('A' == 65);       //ASCAII character

        byte b = 65;
        System.out.print("In SOP statement, all are Integers :  ");
        System.out.print('A' == b);
        System.out.println("-------------------------------");


        System.out.println('A' == 65.0);     // this is double
        System.out.println('A' == 65.0f);    // this is float
    }
}
