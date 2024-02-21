package oops_Collection_3rd_Feb;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        // Add odd digit

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number ");
        int num = sc.nextInt();

        System.out.println(sumAdd(num));

    }

    public static int sumAdd(int num){
        int sum = 0;
        int i = 1;
        while (i <= num){
            sum += i;
            i = i+2;
        }
        return sum;
    }
}
