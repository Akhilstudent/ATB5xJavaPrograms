package Questions;

import java.util.Scanner;

public class ques6 {
    public static void main(String[] args) {

        //Grade Calculator: Develop a program that calculates grades based on score input.
        // Use conditional statements to assign letter grades (A, B, C, D, F) based on score ranges.
//        A--> grade A --> 80-90
//        B--> grade B --> 70-80
//        C--> grade C --> 70-80
//        D--> grade D --> 60-70
//

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number ");
        int result = sc.nextInt();

        if (result>=80 && result<=90){
            System.out.println("Grade A");
        } else if (result>=70 && result<=80) {
            System.out.println("Grade B");
        } else if (result>=70 && result<=80) {
            System.out.println("Grade C");
        } else if (result>=60 && result<=70) {
            System.out.println("Grade D");
        }else {
            System.out.println("Not Good");
        }
        sc.close();


    }
}
