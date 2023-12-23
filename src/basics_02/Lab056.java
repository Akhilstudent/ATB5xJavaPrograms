package src.basics_02;

import java.util.Scanner;

public class Lab056 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num_Day = sc.nextInt();

        switch (num_Day){
            case 1 :
                System.out.println("Mon");
                break;
            case 2 :
                System.out.println("Tue");
                break;
            case 3 :
                System.out.println("Wed");
                break;
            case 4 :
                System.out.println("Thrusday");
                break;
            case 5 :
                System.out.println("Fri");
                break;
            case 6 :
                System.out.println("Sat");
                break;
            case 7 :
                System.out.println("Sun");
                break;
            default:
                System.out.println("Are you Mad");
                break;         // This is Optional



        }
    }
}
