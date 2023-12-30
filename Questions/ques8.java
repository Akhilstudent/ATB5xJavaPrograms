package Questions;

import java.util.Scanner;

public class ques8 {
    public static void main(String[] args) {
        //Sum of Digits: Create a program that calculates the sum of all digits of a given number.
        // For instance, if the input is 123, the output should be 6 (1+2+3).

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number");
        int num = sc.nextInt();


        int rem = 0;
        int sum = 0;
        while (num>0){
            rem = num%10;
            sum = sum+rem;
            num = num/10;
        }
        System.out.println(sum);


    }
}
