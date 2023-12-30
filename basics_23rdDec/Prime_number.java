package basics_23rdDec;

import java.util.Scanner;

public class Prime_number {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int number = sc.nextInt();

        int check = 0;

        for(int i = 1; i <= number; i++){
            if (number%i == 0){
                check++;
            }
        }
        if (check==2){
            System.out.println("Prime number");
        }
        else {
            System.out.println("Not Prime");
        }
    }
}
