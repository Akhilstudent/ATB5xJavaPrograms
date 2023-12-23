package src.basics_02;

import java.util.Scanner;

public class Lab057 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of Browser ");
        String browser = sc.next();

        switch (browser){
            case "Chrome":
                System.out.println("You are in Chrome");
                break;
            case "Edge":
                System.out.println("You are in Edge");
                break;
            case "IE":
                System.out.println("You are in IE");
                break;
            default:
                System.out.println("No Browser here");
        }


    }
}
