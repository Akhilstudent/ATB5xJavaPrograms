package Questions;

import java.util.Scanner;

public class mul {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of A ");
        int a = sc.nextInt();             //8

        System.out.println("Enter the value of B ");
        int b = sc.nextInt();            //4

        int ans = 0;
        for (int i=0; i<b; i++){
            ans = ans + a;
            System.out.println(ans);
        }
    }
}
