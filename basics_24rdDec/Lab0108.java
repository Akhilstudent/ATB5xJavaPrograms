package basics_24rdDec;

public class Lab0108 {
    public static void main(String[] args) {

        //Write a program that determine weather given number is leap year
        //A leap year is divisible by 4.
        // but not by 100 unless it is divisible by 400

//        A -> if(i %4 == 0)
//        B -> else(i%100 == 1 && i%400 == 0)


        int year = 1900;

        if ((year%4 == 0 && !(year%100 == 0)) || (year%400==0)) {
            System.out.println("Leap year");
        }else {
            System.out.println("Not Leap Year");
        }
    }
}
