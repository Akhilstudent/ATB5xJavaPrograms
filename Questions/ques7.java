package Questions;

import java.util.Scanner;

public class ques7 {
    public static void main(String[] args) {
        //Multiplication Table Printer:
        // Write a program that prints the multiplication table of a given number up to a certain range.

       // A --> 2*2=2

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number");
        int num = sc.nextInt();

        for (int i=1; i<=10; i++){
            System.out.println(num + "*" + i + "=" + num*i);
        }



    }
}
