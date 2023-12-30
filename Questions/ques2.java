package Questions;

import java.util.Scanner;

public class ques2 {
    public static void main(String[] args) {
//        Prime Number Checker: Create a program that checks if a given number is prime or not.
//                Use loops to divide the number by all numbers lesser than it to check for divisibility.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number ");
        int result = sc.nextInt();

        int check = 0;

        for (int i =1; i<= result; i++){
            if (result%i == 0){
                check++;
            }
        }
        if (check==2){
            System.out.println("Prime Number");
        }else {
            System.out.println("Not Prime Number");
        }

    }
}
