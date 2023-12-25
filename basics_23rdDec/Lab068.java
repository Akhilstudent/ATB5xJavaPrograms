package basics_23rdDec;

import java.util.Scanner;

public class Lab068 {
    public static void main(String[] args) {

        // 1/3((x^2) + (y^2) - |z|)

//        A -  (x^2)
//        B -  (y^2)
//        C -  |z|

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of X ");
        double x = sc.nextDouble();

        System.out.println("Enter the value of Y ");
        double y = sc.nextDouble();

        System.out.println("Enter the value of Z ");
        double z = sc.nextDouble();

        double result = 0;

        result = Math.cbrt(Math.pow(x,2) + Math.pow(y,2) - Math.abs(z));
        System.out.println(result);

        sc.close();
    }
}
