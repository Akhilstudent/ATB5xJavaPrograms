package src.basics_02;

import java.util.Scanner;

public class Lab052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        // Not recommended

        if (score >=90 && score <=100)
        {
            System.out.println("Your score --> A");
        } if (score >= 80 && score <=89) {
            System.out.println("Your score --> B");
        }
         if (score >= 70 && score <=79) {
            System.out.println("Your score --> C");

        }if (score >= 60 && score <=69) {
            System.out.println("Your score --> D");
         }
         if (score >0 && score <=59)
         {
             System.out.println("Your score --> E");



    }
    }
}
