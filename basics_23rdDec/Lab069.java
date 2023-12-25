package basics_23rdDec;

import java.util.Scanner;

public class Lab069 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name ");
        String name = sc.next();

        System.out.println("Enter your age ");
        int age = sc.nextInt();

        System.out.println("Enter your Salary ");
        double salary = sc.nextDouble();

        System.out.println("Here is details " + name + " "+ age + " " + salary);

        sc.close();
    }
}
