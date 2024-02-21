package oops_Collection_3rd_Feb;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        // when add first element & second element. This give third number
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your 1st number ");
        int num = sc.nextInt();
        print_Fibonacci(num);
    }

    public static void print_Fibonacci(int num){
        if (num < 0) return;
        System.out.print("0 ");
        if (num == 0) return;
        System.out.print("1 ");

        int first=0, second = 1;

        while(first + second <= num){
            int third = first + second;
            System.out.print(third + " ");

            first = second;
            second = third;

        }
    }
}
