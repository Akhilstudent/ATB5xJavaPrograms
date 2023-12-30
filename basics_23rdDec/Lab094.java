package basics_23rdDec;

import java.util.Scanner;

public class Lab094 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number ");
        int number = sc.nextInt();

        long fact = 1;

        int i = 1;
        while (i<=number){
            fact = fact*i;
            i++;
        }
        System.out.println(fact);
        sc.close();
    }

}
