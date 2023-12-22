package src.basics_02;

import java.util.Scanner;

public class Lab048 {
    public static void main(String[] args) {

        // take two input from user & give max number

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a>b){
            System.out.println("A is max");
        }
        else {
            System.out.println("B is max");
        }


    }
}
