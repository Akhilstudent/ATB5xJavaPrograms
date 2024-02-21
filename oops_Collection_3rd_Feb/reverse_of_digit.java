package oops_Collection_3rd_Feb;

import java.util.Scanner;

public class reverse_of_digit {
    public static void main(String[] args) {

        // Reverse of digit 236 = 236 = 632

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number ");
        int num = sc.nextInt();

        System.out.println(reverseOfDigit(num));
    }

    public static int reverseOfDigit(int num){
        int newNum = 0;
        while (num > 0 ){
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num = num / 10;

        }
        return newNum;
    }

}
