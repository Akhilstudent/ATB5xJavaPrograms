package src.basics_02;

import java.util.Scanner;

public class Lab058 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character, I will tell  ");
        char user_input = sc.next().toCharArray()[0];

        switch (user_input){
            case 'a':
                System.out.println("Vowel");
                break;
            case 'e':
                System.out.println("Vowel");
                break;
            case 'i':
                System.out.println("Vowel");
                break;
            case 'o':
                System.out.println("Vowel");
                break;
            case 'u':
                System.out.println("Vowel");
                break;

            default:
                System.out.println("Not a vowel");

        }
    }
}
