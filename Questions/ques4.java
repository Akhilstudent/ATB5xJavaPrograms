package Questions;

import java.util.Scanner;

public class ques4 {
    public static void main(String[] args) {
        // Factorial Calculator: Write a program to calculate the factorial of a given number using loops.

        //A--> 5*4*3*2*1
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number ");
        int result = sc.nextInt();

        long fact = 1;

        for (int i =1; i<=result; i++){
            fact = fact*i;

        }
        System.out.println(fact);


    }
}
