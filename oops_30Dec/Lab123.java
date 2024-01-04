package oops_30Dec;

import java.util.Scanner;

public class Lab123 {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter value A ");
        int a = sc.nextInt();
        System.out.println("Enter value B ");
        int b = sc.nextInt();

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("Value of a & b" + a + "-" + b);
    }
}
