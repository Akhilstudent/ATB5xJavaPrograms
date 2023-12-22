package src.basics_02;

import java.util.Scanner;

public class Lab047 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check it is Even or Odd");
        int a = sc.nextInt();

        if(a%2 == 1){
            System.out.println("Odd Number");
        }
        else {
            System.out.println("Even Number");
        }

    }
}
