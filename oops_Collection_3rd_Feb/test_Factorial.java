package oops_Collection_3rd_Feb;

import java.util.Scanner;

public class test_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number ");
        int num = sc.nextInt();

        System.out.println(fact(num));
    }

    public static long fact(int num){
        int fa = 1;
        int i = 1;
        while (i <= num){
            fa = fa * i;
            i++;
        }
        return fa;


    }


}
