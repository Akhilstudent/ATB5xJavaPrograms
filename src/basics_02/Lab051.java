package src.basics_02;

import java.util.Scanner;

public class Lab051 {
    public static void main(String[] args) {

//        Write a program that calculate & displays the Grade for given numerical
//        grade scaling
//        A = 90-100
//        B = 80-89
//        C = 70-79
//        D = 60-69
//        E = 0-59
//
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        if (score >=90 && score <=100)
        {
            System.out.println("Your score --> A");
        } else if (score >= 80 && score <=89) {
            System.out.println("Your score --> B");
        }
        else if (score >= 70 && score <=79) {
            System.out.println("Your score --> C");

        }else if (score >= 60 && score <=69) {
            System.out.println("Your score --> D");

        }
        else {
            System.out.println("our score -->E");
        }


    }
}
