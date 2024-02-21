package oops_Collection_3rd_Feb;

import java.util.Scanner;

public class sum_of_digit {
    public static void main(String[] args) {

        // Count sum of digit 236 = 2+3+6 = 11

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number ");
        int num = sc.nextInt();

        System.out.println(sumOfDigit(num));
    }

    public static int sumOfDigit(int num){
        int sum = 0;
        while (num > 0 ){
            sum = sum + num%10;
            num = num / 10;

        }
        return sum;
    }

}
