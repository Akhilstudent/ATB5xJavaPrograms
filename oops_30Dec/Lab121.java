package oops_30Dec;

import java.util.Scanner;

public class Lab121 {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter value A ");
        int a = sc.nextInt();
        System.out.println("Enter value B ");
        int b = sc.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println("Value of a & b" + a + "-" + b);
    }
}
