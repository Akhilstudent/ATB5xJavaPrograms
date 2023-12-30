package basics_24rdDec;

import java.util.Scanner;

public class Lab0105 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float[] marks = new float[5];

        System.out.println("Enter First Subject ");
        marks[0] = sc.nextFloat();
        System.out.println("Enter Second Subject ");
        marks[1] = sc.nextFloat();
        System.out.println("Enter Third Subject ");
        marks[2] = sc.nextFloat();
        System.out.println("Enter Fourth Subject ");
        marks[3] = sc.nextFloat();
        System.out.println("Enter Fifth Subject ");
        marks[4] = sc.nextFloat();

        for (int i =0; i<marks.length; i++){
            if (marks[i] <30){
                System.out.println("You are Fail " + marks[i]);
            }
            System.out.println(marks[i]);
        }

    }
}
