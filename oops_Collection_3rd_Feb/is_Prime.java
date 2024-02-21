package oops_Collection_3rd_Feb;

import java.util.Scanner;

public class is_Prime {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number ");
        int num = sc.nextInt();
        boolean prime = isPrime(num);
        //System.out.println(prime);
        if (prime){
            System.out.println("Prime");
        }else {
            System.out.println("Not prime");
        }

    }

    public static boolean isPrime(int num){
        int i = 2;
        while (i < num){
            if (num % i == 0){
                return false;
            }
            i++;

        }return true;
    }




}
