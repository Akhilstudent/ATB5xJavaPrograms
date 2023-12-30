package basics_23rdDec;

import java.util.Scanner;

public class Lab095 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int input = sc.nextInt();

        // Sum of Digit  5+4+3+2+1 = 15

        float add = 0;

        int i = 1;
        while (i<=input){
            add = add+i;
            i++;
        }
        System.out.println(add);

    }
}
