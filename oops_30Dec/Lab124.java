package oops_30Dec;

import java.util.Scanner;

public class Lab124 {
    public static void main(String[] args) {

        // Take user input as a array

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size");
        int n = sc.nextInt();
        int[] int_array = new int[n];

        System.out.println("Enter the elements ");
        for (int i=0; i<n; i++){
            int_array[i] = sc.nextInt();
        }
        System.out.println("-----Output here");

        for (int i=0; i<n; i++){
            System.out.println(int_array[i]);
        }
    }
}
